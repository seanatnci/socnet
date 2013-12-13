import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_accountedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/account/edit.gsp" }
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
createTagBody(2, {->
printHtmlPart(13)
invokeTag('renderErrors','g',21,['bean':(person),'as':("list")],-1)
printHtmlPart(14)
})
invokeTag('hasErrors','g',23,['bean':(person)],2)
printHtmlPart(15)
expressionOut.print(person.id)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
expressionOut.print(person.id)
printHtmlPart(18)
expressionOut.print(person.version)
printHtmlPart(19)
expressionOut.print(hasErrors(bean:person,field:'username','errors'))
printHtmlPart(20)
expressionOut.print(person.username?.encodeAsHTML())
printHtmlPart(21)
expressionOut.print(hasErrors(bean:person,field:'userRealName','errors'))
printHtmlPart(22)
expressionOut.print(person.userRealName?.encodeAsHTML())
printHtmlPart(23)
expressionOut.print(hasErrors(bean:person,field:'passwd','errors'))
printHtmlPart(24)
expressionOut.print(person.passwd?.encodeAsHTML())
printHtmlPart(25)
expressionOut.print(hasErrors(bean:person,field:'enabled','errors'))
printHtmlPart(26)
invokeTag('checkBox','g',61,['name':("enabled"),'value':(person.enabled)],-1)
printHtmlPart(27)
expressionOut.print(hasErrors(bean:person,field:'description','errors'))
printHtmlPart(28)
expressionOut.print(person.description?.encodeAsHTML())
printHtmlPart(29)
expressionOut.print(hasErrors(bean:person,field:'email','errors'))
printHtmlPart(30)
expressionOut.print(person?.email?.encodeAsHTML())
printHtmlPart(31)
expressionOut.print(hasErrors(bean:person,field:'emailShow','errors'))
printHtmlPart(26)
invokeTag('checkBox','g',82,['name':("emailShow"),'value':(person.emailShow)],-1)
printHtmlPart(32)
expressionOut.print(hasErrors(bean:person,field:'authorities','errors'))
printHtmlPart(33)
for( entry in (roleMap) ) {
printHtmlPart(34)
expressionOut.print(entry.key.authority.encodeAsHTML())
printHtmlPart(35)
invokeTag('checkBox','g',92,['name':(entry.key.authority),'value':(entry.value)],-1)
printHtmlPart(36)
}
printHtmlPart(37)
invokeTag('actionSubmit','g',104,['class':("save"),'value':("Update")],-1)
printHtmlPart(38)
invokeTag('actionSubmit','g',105,['class':("delete"),'onclick':("return confirm('Are you sure?');"),'value':("Delete")],-1)
printHtmlPart(39)
})
invokeTag('form','g',108,[:],2)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(2)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1314618020000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
