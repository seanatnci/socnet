import socnet.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_usercreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/create.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.create.label"),'args':([entityName])],-1)
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
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('renderErrors','g',22,['bean':(userInstance),'as':("list")],-1)
printHtmlPart(11)
})
invokeTag('hasErrors','g',24,['bean':(userInstance)],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('message','g',32,['code':("user.apiKey.label"),'default':("Api Key")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'apiKey', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',35,['name':("apiKey"),'value':(userInstance?.apiKey)],-1)
printHtmlPart(15)
invokeTag('message','g',41,['code':("user.defaultContacts.label"),'default':("Default Contacts")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'defaultContacts', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',44,['name':("defaultContacts"),'value':(fieldValue(bean: userInstance, field: 'defaultContacts'))],-1)
printHtmlPart(16)
invokeTag('message','g',50,['code':("user.login.label"),'default':("User Name")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'login', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',53,['name':("login"),'value':(userInstance?.login)],-1)
printHtmlPart(17)
invokeTag('message','g',59,['code':("user.name.label"),'default':("Name")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'name', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',62,['name':("name"),'value':(userInstance?.name)],-1)
printHtmlPart(18)
invokeTag('message','g',68,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',71,['name':("email"),'value':(fieldValue(bean: userInstance, field: 'email'))],-1)
printHtmlPart(19)
invokeTag('message','g',77,['code':("user.password.label"),'default':("Password")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'password', 'errors'))
printHtmlPart(14)
invokeTag('passwordField','g',80,['name':("password"),'value':("")],-1)
printHtmlPart(20)
invokeTag('message','g',85,['code':("user.confirmPassword.label"),'default':("Confirm Password")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'confirmPassword', 'errors'))
printHtmlPart(14)
invokeTag('passwordField','g',88,['name':("confirmPassword"),'value':("")],-1)
printHtmlPart(21)
invokeTag('message','g',95,['code':("user.status.label"),'default':("Status")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'status', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',98,['name':("status"),'value':(fieldValue(bean: userInstance, field: 'status'))],-1)
printHtmlPart(22)
invokeTag('submitButton','g',106,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(23)
})
invokeTag('form','g',108,['action':("save")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',110,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1315323634000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
