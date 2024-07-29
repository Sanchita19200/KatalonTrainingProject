<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>main_Create New Customer Account         wi_6aa9df</name>
   <tag></tag>
   <elementGuidId>a437df6f-e1f6-4d3d-91b4-6623470ab3d0</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//main[@id='maincontent']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#maincontent</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;Create New Customer Account Personal Information First Name Last Name Sign-in In&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>main</value>
      <webElementGuid>b82f3335-28cb-4449-bcc7-c6272f0a898e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>maincontent</value>
      <webElementGuid>a8cbcc8c-3755-4b6d-9a59-6134a0df0e74</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>page-main</value>
      <webElementGuid>76a8f159-ace3-40af-bf53-f3637362ccb4</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>


Create New Customer Account 









        window.authenticationPopup = {&quot;autocomplete&quot;:&quot;off&quot;,&quot;customerRegisterUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/customer\/account\/create\/&quot;,&quot;customerForgotPasswordUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/customer\/account\/forgotpassword\/&quot;,&quot;baseUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/&quot;};
    











 
Personal Information



First Name





Last Name






Sign-in Information

Email





Password




Password Strength:

No Password 





Confirm Password







Create an Account


Back




require([
    'jquery',
    'mage/mage'
], function($){

    var dataForm = $('#form-validate');
    var ignore = null;

    dataForm.mage('validation', {
            ignore: ignore ? ':hidden:not(' + ignore + ')' : ':hidden'
        }).find('input:text').attr('autocomplete', 'off');
});



</value>
      <webElementGuid>5f24e606-07b0-4487-a7a6-d857870e0340</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;maincontent&quot;)</value>
      <webElementGuid>4a8cb493-3ecd-4a1b-ab9f-28907523a08e</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//main[@id='maincontent']</value>
      <webElementGuid>b5092bc9-8387-4c75-8d81-14801ec5b392</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Create an Account'])[2]/following::main[1]</value>
      <webElementGuid>e79dc527-f76d-4387-9847-dcb9cf1085c8</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Sign In'])[2]/following::main[1]</value>
      <webElementGuid>52b2b1b6-3228-4b33-b650-096f13264ef8</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//main</value>
      <webElementGuid>682c8d7f-d1dc-45d9-835e-2268c337ecee</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//main[@id = 'maincontent' and (text() = concat(&quot;


Create New Customer Account 









        window.authenticationPopup = {&quot;autocomplete&quot;:&quot;off&quot;,&quot;customerRegisterUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/customer\/account\/create\/&quot;,&quot;customerForgotPasswordUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/customer\/account\/forgotpassword\/&quot;,&quot;baseUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/&quot;};
    











 
Personal Information



First Name





Last Name






Sign-in Information

Email





Password




Password Strength:

No Password 





Confirm Password







Create an Account


Back




require([
    &quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot;,
    &quot; , &quot;'&quot; , &quot;mage/mage&quot; , &quot;'&quot; , &quot;
], function($){

    var dataForm = $(&quot; , &quot;'&quot; , &quot;#form-validate&quot; , &quot;'&quot; , &quot;);
    var ignore = null;

    dataForm.mage(&quot; , &quot;'&quot; , &quot;validation&quot; , &quot;'&quot; , &quot;, {
            ignore: ignore ? &quot; , &quot;'&quot; , &quot;:hidden:not(&quot; , &quot;'&quot; , &quot; + ignore + &quot; , &quot;'&quot; , &quot;)&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;:hidden&quot; , &quot;'&quot; , &quot;
        }).find(&quot; , &quot;'&quot; , &quot;input:text&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;autocomplete&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;off&quot; , &quot;'&quot; , &quot;);
});



&quot;) or . = concat(&quot;


Create New Customer Account 









        window.authenticationPopup = {&quot;autocomplete&quot;:&quot;off&quot;,&quot;customerRegisterUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/customer\/account\/create\/&quot;,&quot;customerForgotPasswordUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/customer\/account\/forgotpassword\/&quot;,&quot;baseUrl&quot;:&quot;https:\/\/magento.softwaretestingboard.com\/&quot;};
    











 
Personal Information



First Name





Last Name






Sign-in Information

Email





Password




Password Strength:

No Password 





Confirm Password







Create an Account


Back




require([
    &quot; , &quot;'&quot; , &quot;jquery&quot; , &quot;'&quot; , &quot;,
    &quot; , &quot;'&quot; , &quot;mage/mage&quot; , &quot;'&quot; , &quot;
], function($){

    var dataForm = $(&quot; , &quot;'&quot; , &quot;#form-validate&quot; , &quot;'&quot; , &quot;);
    var ignore = null;

    dataForm.mage(&quot; , &quot;'&quot; , &quot;validation&quot; , &quot;'&quot; , &quot;, {
            ignore: ignore ? &quot; , &quot;'&quot; , &quot;:hidden:not(&quot; , &quot;'&quot; , &quot; + ignore + &quot; , &quot;'&quot; , &quot;)&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;:hidden&quot; , &quot;'&quot; , &quot;
        }).find(&quot; , &quot;'&quot; , &quot;input:text&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;autocomplete&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;off&quot; , &quot;'&quot; , &quot;);
});



&quot;))]</value>
      <webElementGuid>edc7fff1-b836-44f3-a9ab-8ba09f6ec364</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
