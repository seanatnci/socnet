import socnet.UserStop
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_userStopcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userStop/create.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'userStop.label', default: 'UserStop'))],-1)
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
createClosureForHtmlPart(7, 2)
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(8)
invokeTag('loginControl','g',15,[:],-1)
printHtmlPart(9)
invokeTag('message','g',18,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('renderErrors','g',24,['bean':(userStopInstance),'as':("list")],-1)
printHtmlPart(15)
})
invokeTag('hasErrors','g',26,['bean':(userStopInstance)],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('message','g',34,['code':("userStop.apiKey.label"),'default':("Api Key")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: userStopInstance, field: 'apiKey', 'errors'))
printHtmlPart(18)
invokeTag('textField','g',37,['name':("apiKey"),'value':(userStopInstance?.apiKey)],-1)
printHtmlPart(19)
invokeTag('message','g',43,['code':("userStop.word.label"),'default':("Word")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: userStopInstance, field: 'word', 'errors'))
printHtmlPart(18)
invokeTag('textField','g',46,['name':("word"),'value':(userStopInstance?.word)],-1)
printHtmlPart(20)
invokeTag('submitButton','g',54,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(21)
})
invokeTag('form','g',56,['action':("save")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',58,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314728428000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
