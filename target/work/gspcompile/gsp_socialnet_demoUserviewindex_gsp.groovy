import socnet.DemoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_demoUserviewindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/demoUser/viewindex.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'demoUser.label', default: 'DemoUser'))],-1)
printHtmlPart(2)
invokeTag('javascript','g',11,['src':("hosturl.js")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',12,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',20,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',21,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',21,['class':("list"),'controller':("api"),'action':("demo")],2)
printHtmlPart(8)
invokeTag('loginControl','g',22,[:],-1)
printHtmlPart(9)
loop:{
int i = 0
for( demoUserInstance in (demoUserInstanceList) ) {
printHtmlPart(10)
expressionOut.print(demoUserInstance.identity)
printHtmlPart(11)
expressionOut.print(i+1)
printHtmlPart(12)
expressionOut.print(message(code:'spinner.alt',default:'Loading...'))
printHtmlPart(13)
expressionOut.print(demoUserInstance.name)
printHtmlPart(14)
expressionOut.print(demoUserInstance.country)
printHtmlPart(15)
expressionOut.print(demoUserInstance.state)
printHtmlPart(15)
expressionOut.print(demoUserInstance.town)
printHtmlPart(16)
expressionOut.print(demoUserInstance.identity)
printHtmlPart(17)
expressionOut.print(demoUserInstance.identity)
printHtmlPart(18)
invokeTag('message','g',36,['code':("demoUser.bio.label"),'default':("Bio")],-1)
printHtmlPart(19)
expressionOut.print(demoUserInstance.identity)
printHtmlPart(6)
expressionOut.print(demoUserInstance.bio)
printHtmlPart(20)
invokeTag('message','g',39,['code':("demoUser.likes.label"),'default':("Likes")],-1)
printHtmlPart(21)
expressionOut.print(demoUserInstance.identity)
printHtmlPart(22)
expressionOut.print(demoUserInstance.likes)
printHtmlPart(20)
invokeTag('message','g',42,['code':("demoUser.needs.label"),'default':("Needs")],-1)
printHtmlPart(23)
expressionOut.print(demoUserInstance.identity)
printHtmlPart(6)
expressionOut.print(demoUserInstance.needs)
printHtmlPart(24)
i++
}
}
printHtmlPart(25)
invokeTag('render','g',52,['template':("/shared/sidebar")],-1)
printHtmlPart(26)
expressionOut.print(resource(dir:'images',file:'index.PNG'))
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1386871274173L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
