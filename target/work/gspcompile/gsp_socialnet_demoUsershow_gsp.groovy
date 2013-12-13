import socnet.DemoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_socialnet_demoUsershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/demoUser/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'demoUser.label', default: 'DemoUser'))],-1)
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
invokeTag('message','g',17,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('message','g',26,['code':("demoUser.id.label"),'default':("Id")],-1)
printHtmlPart(13)
expressionOut.print(demoUserInstance.id)
printHtmlPart(14)
invokeTag('message','g',33,['code':("demoUser.bio.label"),'default':("Bio")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "bio"))
printHtmlPart(14)
invokeTag('message','g',40,['code':("demoUser.country.label"),'default':("Country")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "country"))
printHtmlPart(14)
invokeTag('message','g',47,['code':("demoUser.likes.label"),'default':("Likes")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "likes"))
printHtmlPart(14)
invokeTag('message','g',54,['code':("demoUser.name.label"),'default':("Name")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "name"))
printHtmlPart(14)
invokeTag('message','g',61,['code':("demoUser.needs.label"),'default':("Needs")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "needs"))
printHtmlPart(14)
invokeTag('message','g',68,['code':("demoUser.state.label"),'default':("State")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "state"))
printHtmlPart(14)
invokeTag('message','g',75,['code':("demoUser.town.label"),'default':("Town")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: demoUserInstance, field: "town"))
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('hiddenField','g',86,['name':("id"),'value':(demoUserInstance?.id)],-1)
printHtmlPart(17)
invokeTag('actionSubmit','g',87,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(18)
invokeTag('actionSubmit','g',88,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(19)
})
invokeTag('form','g',89,[:],2)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',92,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1315142644000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
