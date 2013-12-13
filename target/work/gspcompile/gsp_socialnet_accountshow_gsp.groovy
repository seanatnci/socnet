import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_accountshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',2,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(1, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLinkTo(dir:''))
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',10,['class':("list"),'action':("list")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',11,['class':("create"),'action':("create")],2)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(person.id)
printHtmlPart(13)
expressionOut.print(person.username?.encodeAsHTML())
printHtmlPart(14)
expressionOut.print(person.userRealName?.encodeAsHTML())
printHtmlPart(15)
expressionOut.print(person.enabled)
printHtmlPart(16)
expressionOut.print(person.description?.encodeAsHTML())
printHtmlPart(17)
expressionOut.print(person.email?.encodeAsHTML())
printHtmlPart(18)
expressionOut.print(person.emailShow)
printHtmlPart(19)
for( name in (roleNames) ) {
printHtmlPart(20)
expressionOut.print(name)
printHtmlPart(21)
}
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
expressionOut.print(person.id)
printHtmlPart(24)
invokeTag('actionSubmit','g',76,['class':("edit"),'value':("Edit")],-1)
printHtmlPart(25)
invokeTag('actionSubmit','g',77,['class':("delete"),'onclick':("return confirm('Are you sure?');"),'value':("Delete")],-1)
printHtmlPart(26)
})
invokeTag('form','g',78,[:],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',82,[:],1)
printHtmlPart(2)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314618022000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
