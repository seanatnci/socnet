import socnet.UserStop
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_userStopedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userStop/edit.gsp" }
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
createClosureForHtmlPart(7, 2)
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('loginControl','g',16,[:],-1)
printHtmlPart(11)
invokeTag('message','g',19,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('renderErrors','g',25,['bean':(userStopInstance),'as':("list")],-1)
printHtmlPart(17)
})
invokeTag('hasErrors','g',27,['bean':(userStopInstance)],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(18)
invokeTag('hiddenField','g',29,['name':("id"),'value':(userStopInstance?.id)],-1)
printHtmlPart(18)
invokeTag('hiddenField','g',30,['name':("version"),'value':(userStopInstance?.version)],-1)
printHtmlPart(19)
invokeTag('message','g',37,['code':("userStop.apiKey.label"),'default':("Api Key")],-1)
printHtmlPart(20)
expressionOut.print(hasErrors(bean: userStopInstance, field: 'apiKey', 'errors'))
printHtmlPart(21)
invokeTag('textField','g',40,['name':("apiKey"),'value':(userStopInstance?.apiKey)],-1)
printHtmlPart(22)
invokeTag('message','g',46,['code':("userStop.word.label"),'default':("Word")],-1)
printHtmlPart(20)
expressionOut.print(hasErrors(bean: userStopInstance, field: 'word', 'errors'))
printHtmlPart(21)
invokeTag('textField','g',49,['name':("word"),'value':(userStopInstance?.word)],-1)
printHtmlPart(23)
invokeTag('actionSubmit','g',57,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(24)
invokeTag('actionSubmit','g',58,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(25)
})
invokeTag('form','g',60,['method':("post")],2)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',62,[:],1)
printHtmlPart(27)
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
