package com.app

class Demo {

	static void main(args) {
		
		def urlContents="http://aba.myspecies.info/".toURL().getText()
		urlContents.eachLine{
			println it
		}
		
	}
}
