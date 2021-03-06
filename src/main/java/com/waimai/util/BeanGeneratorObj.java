package com.waimai.util;

import java.util.HashMap;
import java.util.Map;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.core.ClassEmitter;
import net.sf.cglib.core.Constants;
import net.sf.cglib.core.EmitUtils;
import net.sf.cglib.core.TypeUtils;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;
/**
 * @CopyRright (c)2012-20XX:Rainier
 * @Project: auth_core
 * @ModuleID: 
 * @Comments: 生成Bean对象
 * @JDK Version Used:<JDK1.6>		
 * @Namespace: cn.rainier.nian.utils
 * @Author: 李年
 * @Create Date: 2013-5-24
 * @Modified By: 
 * @Modified Date: 
 * @Why & What is modified: ? <修改原因描述>		
 * @Version:1.0<版本号>
 */
public class BeanGeneratorObj extends BeanGenerator{
	public BeanGeneratorObj(){}
	private Map props = new HashMap();
	
	public void addProperty(String name, Class type) {
		super.addProperty(name, type);
		if (props.containsKey(name)) {
			throw new IllegalArgumentException("Duplicate property name \"" + name + "\"");
		}
		props.put(name, Type.getType(type));
	}

	public void generateClass(ClassVisitor v) throws Exception {
		int size = props.size();
		String[] names = (String[]) props.keySet().toArray(new String[size]);
		Type[] types = new Type[size];
		for (int i = 0; i < size; i++) {
			types[i] = (Type) props.get(names[i]);
		}
		ClassEmitter ce = new ClassEmitter(v);
		ce.begin_class(Constants.V1_2, Constants.ACC_PUBLIC, getClassName(),
				getDefaultClassLoader() != null ? Type.getType(getDefaultClassLoader().getClass())
						: Constants.TYPE_OBJECT, TypeUtils.parseTypes("java.io.Serializable"), null);
		EmitUtils.null_constructor(ce);
		add_properties(ce, names, types);
		ce.end_class();
	}
	
	private void add_properties(ClassEmitter ce, String[] names, Type[] types) {
        for (int i = 0; i < names.length; i++) {
            String fieldName = names[i];
            ce.declare_field(Constants.ACC_PRIVATE, fieldName, types[i], null);
            EmitUtils.add_property(ce, names[i], types[i], fieldName);
        }
    }
}
