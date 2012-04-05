#Twitter Bootstrap for GWT

Twitter Bootstrap for GWT is a widget library for Google Web Toolkit(GWT).

#Caution
Right now , Our team help to [gwt-bootstrap](https://github.com/gwtbootstrap/gwt-bootstrap).
Maybe we stop developing bootstrap4gwt until gwt-bootstrap is released.

##demo
http://yusukekokubo.github.com/bootstrap4gwt/

##build for library
mvn clean compile

##build with sample
mvn -Pfor-sample clean compile

##using
* download https://github.com/downloads/YusukeKokubo/bootstrap4gwt/bootstrap4gwt.jar
 * !Caution! Now this file is early-access(SNAPSHOT) version.
* adding <code>&lt;inherits name="com.appspot.bootstrap4gwt.Bootstrap"/&gt;</code> in your module xml
* If you need use in UiBinder,adding <code>xmlns:b="urn:import:com.appspot.bootstrap4gwt.client.ui"</code> in root of ui.xml
* load bootstrap.css and bootstrap.js in module html or module xml (*.gwt.xml).<br>
(Please download bootstrap.css and bootstrap.js yourself at http://twitter.github.com/bootstrap/)
 * ex.<br>
  in html. <code>&lt;link rel="stylesheet" href="./assets/css/bootstrap.css"&gt;</code><br>
  in module xml. <code>&lt;stylesheet src="/assets/css/bootstrap.css"/&gt;</code>

##sample code
If you need more sample,you see sample directory.It's demo site code.
  