import socnet.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("list"),'action':("list")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('loginControl','g',15,[:],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('message','g',27,['code':("user.apiKey.label"),'default':("Api Key")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: userInstance, field: "apiKey"))
printHtmlPart(14)
invokeTag('message','g',33,['code':("user.login.label"),'default':("Login")],-1)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: userInstance, field: "login"))
printHtmlPart(16)
invokeTag('message','g',40,['code':("user.name.label"),'default':("Name")],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: userInstance, field: "name"))
printHtmlPart(18)
invokeTag('message','g',46,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: userInstance, field: "email"))
printHtmlPart(19)
invokeTag('message','g',52,['code':("user.defaultContacts.label"),'default':("Default Contacts")],-1)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: userInstance, field: "defaultContacts"))
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('hiddenField','g',61,['name':("id"),'value':(userInstance?.id)],-1)
printHtmlPart(23)
invokeTag('actionSubmit','g',62,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',63,[:],2)
printHtmlPart(25)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',65,['controller':("userStop"),'action':("list")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',69,['class':("bodycenter")],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314738656000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
