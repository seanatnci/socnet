import socnet.DemoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_demoUserstemtext_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/demoUser/stemtext.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',14,['var':("entityName"),'value':(message(code: 'demoUser.label', default: 'DemoUser'))],-1)
printHtmlPart(2)
invokeTag('javascript','g',15,['src':("hosturl.js")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',16,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(3)
expressionOut.print(GrailsUtil.environment)
printHtmlPart(4)
expressionOut.print(demoUserInstance.country)
printHtmlPart(5)
expressionOut.print(demoUserInstance.state)
printHtmlPart(6)
expressionOut.print(demoUserInstance.town)
printHtmlPart(7)
expressionOut.print(demoUserInstance.bio)
printHtmlPart(8)
expressionOut.print(GrailsUtil.environment)
printHtmlPart(9)
expressionOut.print(demoUserInstance.country)
printHtmlPart(5)
expressionOut.print(demoUserInstance.state)
printHtmlPart(6)
expressionOut.print(demoUserInstance.town)
printHtmlPart(10)
})
invokeTag('captureHead','sitemesh',94,[:],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("default.home.label")],-1)
printHtmlPart(14)
createTagBody(2, {->
invokeTag('message','g',98,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',98,['class':("list"),'controller':("api"),'action':("demo")],2)
printHtmlPart(15)
invokeTag('loginControl','g',99,[:],-1)
printHtmlPart(16)
invokeTag('message','g',109,['code':("demoUser.bio.label"),'default':("Bio")],-1)
printHtmlPart(17)
expressionOut.print(demoUserInstance.bio)
printHtmlPart(18)
invokeTag('render','g',125,['template':("/shared/sidebar")],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',150,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1386874704249L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
