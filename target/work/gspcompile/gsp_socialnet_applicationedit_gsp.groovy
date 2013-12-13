import socnet.Application
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_applicationedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/application/edit.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'application.label', default: 'Application'))],-1)
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
invokeTag('message','g',18,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('renderErrors','g',24,['bean':(applicationInstance),'as':("list")],-1)
printHtmlPart(14)
})
invokeTag('hasErrors','g',26,['bean':(applicationInstance)],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('hiddenField','g',28,['name':("id"),'value':(applicationInstance?.id)],-1)
printHtmlPart(15)
invokeTag('hiddenField','g',29,['name':("version"),'value':(applicationInstance?.version)],-1)
printHtmlPart(16)
invokeTag('message','g',36,['code':("application.api.label"),'default':("Api")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: applicationInstance, field: 'api', 'errors'))
printHtmlPart(18)
invokeTag('textField','g',39,['name':("api"),'value':(applicationInstance?.api)],-1)
printHtmlPart(19)
invokeTag('message','g',45,['code':("application.keywords.label"),'default':("Keywords")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: applicationInstance, field: 'keywords', 'errors'))
printHtmlPart(18)
invokeTag('select','g',48,['name':("keywords"),'from':(socnet.Keyword.list()),'multiple':("yes"),'optionKey':("id"),'size':("5"),'value':(applicationInstance?.keywords*.id)],-1)
printHtmlPart(20)
invokeTag('message','g',54,['code':("application.name.label"),'default':("Name")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: applicationInstance, field: 'name', 'errors'))
printHtmlPart(18)
invokeTag('textField','g',57,['name':("name"),'value':(applicationInstance?.name)],-1)
printHtmlPart(21)
invokeTag('actionSubmit','g',65,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(22)
invokeTag('actionSubmit','g',66,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(23)
})
invokeTag('form','g',68,['method':("post")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1313421974000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
