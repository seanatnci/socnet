import socnet.UserDTO
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_useredit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'userDTO.label', default: 'UserDTO'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('loginControl','g',16,[:],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('renderErrors','g',25,['bean':(userInstance),'as':("list")],-1)
printHtmlPart(14)
})
invokeTag('hasErrors','g',27,['bean':(userInstance)],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(15)
expressionOut.print(hasErrors(bean: userInstance, field: 'apiKey', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',35,['name':("apiKey"),'value':(fieldValue(bean: userInstance, field: 'apiKey'))],-1)
printHtmlPart(17)
invokeTag('message','g',40,['code':("userDTO.apiKey.label"),'default':("Api Key")],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: userInstance, field: "apiKey"))
printHtmlPart(19)
invokeTag('message','g',46,['code':("userDTO.login.label"),'default':("Login")],-1)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: userInstance, field: "login"))
printHtmlPart(19)
invokeTag('message','g',53,['code':("userDTO.name.label"),'default':("Name")],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: userInstance, field: "name"))
printHtmlPart(19)
invokeTag('message','g',59,['code':("userDTO.email.label"),'default':("Email")],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: userInstance, field: "email"))
printHtmlPart(21)
invokeTag('message','g',66,['code':("userDTO.defaultContacts.label"),'default':("Default Contacts")],-1)
printHtmlPart(22)
expressionOut.print(hasErrors(bean: userInstance, field: 'defaultContacts', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',69,['name':("defaultContacts"),'value':(fieldValue(bean: userInstance, field: 'defaultContacts'))],-1)
printHtmlPart(23)
invokeTag('actionSubmit','g',79,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',81,['method':("post")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',83,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314722162000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
