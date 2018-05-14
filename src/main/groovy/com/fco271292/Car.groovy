package com.fco271292

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.NONE)
class Car {
	
	@XmlElement
	String id
	@XmlElement
	String name

}
