<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>main_Create New Customer Account         wi_6aa9df</name>
   <tag></tag>
   <elementGuidId>c17372e9-8d20-4db5-ada7-03b8919b0b5b</elementGuidId>
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
      <webElementGuid>ead7dbae-0c9f-48bc-a1ca-5820abff7c49</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>maincontent</value>
      <webElementGuid>72bd5be6-a313-4c43-abf1-23853275de6a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>page-main</value>
      <webElementGuid>498bc138-b2c0-414c-b4eb-aed70766c208</webElementGuid>
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
      <webElementGuid>c0ee0fe1-3409-449b-a8f2-e9e85e86b2a8</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;maincontent&quot;)</value>
      <webElementGuid>8246e66e-7ec5-404f-b473-79e1dc92bb1e</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//main[@id='maincontent']</value>
      <webElementGuid>921244a9-20cc-440b-822d-1c1b3c2faba5</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Create an Account'])[2]/following::main[1]</value>
      <webElementGuid>234bfad9-3c3a-456a-9abd-f92ca86507ff</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Sign In'])[2]/following::main[1]</value>
      <webElementGuid>8a72808d-f4d6-4207-95af-5c104f7fb186</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//main</value>
      <webElementGuid>9cdbdc34-51ed-4e28-afbb-067555c2c0a3</webElementGuid>
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
      <webElementGuid>17daedc0-e2d0-4070-a910-37d899218ad8</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
