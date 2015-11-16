// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public final class dtp extends adj
{

    private static final boolean b = false;
    private static final Map c;
    private static final Map d = new HashMap();
    private static Bundle e = null;
    private static String f = null;
    private static String g = null;

    public dtp()
    {
    }

    private static String a(boolean flag)
    {
        Object obj = g.nU;
        String s1 = eey.h();
        obj = s1;
        if (flag)
        {
            obj = s1;
            if (!TextUtils.isEmpty(s1))
            {
                s1 = eey.k(s1);
                obj = s1;
                if (s1.charAt(0) == '+')
                {
                    obj = s1.substring(1);
                }
            }
        }
        return ((String) (obj));
    }

    public static void a(Context context)
    {
        adj.a = new dtp();
        (new dtq(context)).start();
    }

    private static void a(String s1, String s2, Bundle bundle, Bundle bundle1)
    {
        s1 = ((String) (d.get(s1)));
        if (s1 != null && !(s1 instanceof String)) goto _L2; else goto _L1
_L1:
        s1 = (String)s1;
        if (!TextUtils.equals(bundle.getString(s2), s1))
        {
            bundle1.putString(s2, s1);
        }
_L4:
        return;
_L2:
        if (!(s1 instanceof Integer))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = g.a((Integer)s1, 0);
        if (bundle.getInt(s2) != i1)
        {
            bundle1.putInt(s2, i1);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!(s1 instanceof Boolean)) goto _L4; else goto _L3
_L3:
        boolean flag = g.a((Boolean)s1, false);
        if (bundle.getBoolean(s2) != flag)
        {
            bundle1.putBoolean(s2, flag);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static void a(String s1, String s2, String s3)
    {
        try
        {
            if ("int".equals(s3))
            {
                d.put(s1, Integer.valueOf(Integer.parseInt(s2)));
                return;
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("MmsConfig.update: invalid ").append(s1).append(",").append(s2).append(",").append(s3).toString());
            return;
        }
        if ("bool".equals(s3))
        {
            d.put(s1, Boolean.valueOf(Boolean.parseBoolean(s2)));
            return;
        }
        if ("string".equals(s3))
        {
            d.put(s1, s2);
        }
        return;
    }

    public static void b(Context context)
    {
        eev.e("Babel_SMS", "MmsConfig.loadMmsSettings");
        d.clear();
        d.putAll(c);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            Object obj = (TelephonyManager)context.getSystemService("phone");
            f = ((TelephonyManager) (obj)).getMmsUserAgent();
            g = ((TelephonyManager) (obj)).getMmsUAProfUrl();
            obj = f;
            String s1 = g;
            eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 66 + String.valueOf(s1).length())).append("MmsConfig.loadDeviceMmsSettings from API: mUserAgent=").append(((String) (obj))).append(", mUaProfUrl=").append(s1).toString());
        }
        if (!c(context)) goto _L2; else goto _L1
_L1:
        if (due.a(context))
        {
            Bundle bundle = SmsManager.getDefault().getCarrierConfigValues();
            Bundle bundle1 = new Bundle();
            a("enabledMMS", "enabledMMS", bundle, bundle1);
            a("enabledTransID", "enabledTransID", bundle, bundle1);
            a("enabledNotifyWapMMSC", "enabledNotifyWapMMSC", bundle, bundle1);
            a("aliasEnabled", "aliasEnabled", bundle, bundle1);
            a("allowAttachAudio", "allowAttachAudio", bundle, bundle1);
            a("enableMultipartSMS", "enableMultipartSMS", bundle, bundle1);
            a("enableSMSDeliveryReports", "enableSMSDeliveryReports", bundle, bundle1);
            a("enableGroupMms", "enableGroupMms", bundle, bundle1);
            a("supportMmsContentDisposition", "supportMmsContentDisposition", bundle, bundle1);
            a("config_cellBroadcastAppLinks", "config_cellBroadcastAppLinks", bundle, bundle1);
            a("sendMultipartSmsAsSeparateMessages", "sendMultipartSmsAsSeparateMessages", bundle, bundle1);
            a("enableMMSReadReports", "enableMMSReadReports", bundle, bundle1);
            a("enableMMSDeliveryReports", "enableMMSDeliveryReports", bundle, bundle1);
            a("maxMessageSize", "maxMessageSize", bundle, bundle1);
            a("maxImageHeight", "maxImageWidth", bundle, bundle1);
            a("maxImageWidth", "maxImageHeight", bundle, bundle1);
            a("recipientLimit", "recipientLimit", bundle, bundle1);
            a("httpSocketTimeout", "httpSocketTimeout", bundle, bundle1);
            a("aliasMinChars", "aliasMinChars", bundle, bundle1);
            a("aliasMaxChars", "aliasMaxChars", bundle, bundle1);
            a("smsToMmsTextThreshold", "smsToMmsTextThreshold", bundle, bundle1);
            a("smsToMmsTextLengthThreshold", "smsToMmsTextLengthThreshold", bundle, bundle1);
            a("maxMessageTextSize", "maxMessageTextSize", bundle, bundle1);
            a("maxSubjectLength", "maxSubjectLength", bundle, bundle1);
            a("mUaProfTagName", "uaProfTagName", bundle, bundle1);
            a("httpParams", "httpParams", bundle, bundle1);
            a("emailGatewayNumber", "emailGatewayNumber", bundle, bundle1);
            a("naiSuffix", "naiSuffix", bundle, bundle1);
            bundle = bundle1;
            if (bundle1.isEmpty())
            {
                bundle = null;
            }
            e = bundle;
        }
_L3:
        if (TextUtils.isEmpty(f))
        {
            Object obj1 = String.valueOf("Hangouts/");
            Object obj2 = String.valueOf(String.valueOf(((efu)hlp.a(context, efu)).c()));
            if (((String) (obj2)).length() != 0)
            {
                obj1 = ((String) (obj1)).concat(((String) (obj2)));
            } else
            {
                obj1 = new String(((String) (obj1)));
            }
            f = ((String) (obj1));
        }
        if (TextUtils.isEmpty(g))
        {
            context.getContentResolver();
            g = g.a(g.nU, "babel_mms_uaprofurl", "https://ssl.gstatic.com/android/hangouts/hangouts_mms_ua_profile.xml");
        }
        context = f;
        obj1 = g;
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 51 + String.valueOf(obj1).length())).append("MmsConfig.loadMmsSettings: mUserAgent=").append(context).append(", mUaProfUrl=").append(((String) (obj1))).toString());
        if (b)
        {
            context = String.valueOf(d);
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 25)).append("MmsConfig: all values -- ").append(context).toString());
        }
        return;
_L2:
        eev.e("Babel_SMS", "MmsConfig.loadFromResources");
        obj1 = context.getResources().getXml(g.ij);
        obj2 = dtg.a(((org.xmlpull.v1.XmlPullParser) (obj1)));
        ((dtg) (obj2)).a(new dtr());
        ((dtg) (obj2)).a();
        ((XmlResourceParser) (obj1)).close();
          goto _L3
        context;
        ((XmlResourceParser) (obj1)).close();
        throw context;
    }

    private static String c(String s1)
    {
        s1 = ((String) (d.get(s1)));
        if (s1 != null)
        {
            return (String)s1;
        } else
        {
            return null;
        }
    }

    private static boolean c(Context context)
    {
        Object obj;
        eev.e("Babel_SMS", "MmsConfig.loadFromDatabase");
        context = anh.a(context);
        obj = dvc.a(eey.l());
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return false;
        }
        obj = context.query("mmsconfig", anh.c, "numeric=?", new String[] {
            obj
        }, null, null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        a(((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1), ((Cursor) (obj)).getString(2));
        if (true) goto _L1; else goto _L3
        Object obj1;
        obj1;
_L9:
        context = ((Context) (obj));
        obj1 = String.valueOf(obj1);
        context = ((Context) (obj));
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 30)).append("MmsConfig: no mmsconfig table ").append(((String) (obj1))).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L5:
        return false;
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return true;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        context = null;
_L7:
        if (context != null)
        {
            context.close();
        }
        throw obj;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static Bundle y()
    {
        return e;
    }

    private static String z()
    {
        byte abyte0[];
        String s1;
        s1 = ads.a("persist.radio.cdma.nai");
        abyte0 = s1;
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        String s2 = a().x();
        abyte0 = s1;
        if (!TextUtils.isEmpty(s2))
        {
            abyte0 = String.valueOf(s1);
            s1 = String.valueOf(s2);
            byte abyte1[];
            if (s1.length() != 0)
            {
                abyte0 = abyte0.concat(s1);
            } else
            {
                abyte0 = new String(abyte0);
            }
        }
        abyte1 = Base64.encode(abyte0.getBytes("UTF-8"), 2);
        abyte0 = abyte1;
_L3:
        UnsupportedEncodingException unsupportedencodingexception;
        try
        {
            abyte1 = new String(abyte0, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception1)
        {
            return new String(abyte0);
        }
        abyte0 = abyte1;
_L2:
        return abyte0;
        unsupportedencodingexception;
        abyte0 = Base64.encode(abyte0.getBytes(), 2);
          goto _L3
    }

    public boolean a(String s1)
    {
        if (!g.a((Boolean)d.get("aliasEnabled"), false))
        {
            return false;
        }
        if (s1 == null)
        {
            return false;
        }
        int j1 = s1.length();
        if (j1 < g.a((Integer)d.get("aliasMinChars"), 0) || j1 > g.a((Integer)d.get("aliasMaxChars"), 0))
        {
            return false;
        }
        if (!Character.isLetter(s1.charAt(0)))
        {
            return false;
        }
        for (int i1 = 1; i1 < j1; i1++)
        {
            char c1 = s1.charAt(i1);
            if (!Character.isLetterOrDigit(c1) && c1 != '.')
            {
                return false;
            }
        }

        return true;
    }

    public boolean a(String s1, String s2)
    {
        if (!TextUtils.isEmpty(s1) && c.containsKey(s1))
        {
            s1 = ((String) (c.get(s1)));
            if (s1 != null)
            {
                s1 = s1.getClass();
            } else
            {
                s1 = java/lang/String;
            }
            if ("int".equals(s2))
            {
                return s1 == java/lang/Integer;
            }
            if ("bool".equals(s2))
            {
                return s1 == java/lang/Boolean;
            }
            if ("string".equals(s2))
            {
                return s1 == java/lang/String;
            }
        }
        return false;
    }

    public int b()
    {
        return g.a((Integer)d.get("smsToMmsTextThreshold"), 0);
    }

    public String b(String s1)
    {
        if ("LINE1".equals(s1))
        {
            return a(false);
        }
        if ("LINE1WITHCOUNTRYCODE".equals(s1))
        {
            return a(true);
        }
        if ("NAI".equals(s1))
        {
            return z();
        } else
        {
            return null;
        }
    }

    public int c()
    {
        return g.a((Integer)d.get("smsToMmsTextLengthThreshold"), 0);
    }

    public boolean d()
    {
        return g.a((Boolean)d.get("enabledMMS"), false);
    }

    public int e()
    {
        return g.a((Integer)d.get("maxMessageSize"), 0);
    }

    public boolean f()
    {
        return g.a((Boolean)d.get("enabledTransID"), false);
    }

    public String g()
    {
        return f;
    }

    public String h()
    {
        return c("mUaProfTagName");
    }

    public String i()
    {
        return g;
    }

    public String j()
    {
        return c("httpParams");
    }

    public String k()
    {
        return c("emailGatewayNumber");
    }

    public int l()
    {
        return g.a((Integer)d.get("maxImageHeight"), 0);
    }

    public int m()
    {
        return g.a((Integer)d.get("maxImageWidth"), 0);
    }

    public int n()
    {
        int i1 = g.a((Integer)d.get("maxMessageTextSize"), 0);
        if (i1 >= 0)
        {
            return i1;
        } else
        {
            return 2000;
        }
    }

    public int o()
    {
        return g.a((Integer)d.get("httpSocketTimeout"), 0);
    }

    public boolean p()
    {
        return g.a((Boolean)d.get("enableMultipartSMS"), false);
    }

    public boolean q()
    {
        return g.a((Boolean)d.get("sendMultipartSmsAsSeparateMessages"), false);
    }

    public boolean r()
    {
        return g.a((Boolean)d.get("enableSMSDeliveryReports"), false);
    }

    public boolean s()
    {
        return g.a((Boolean)d.get("enabledNotifyWapMMSC"), false);
    }

    public int t()
    {
        return g.a((Integer)d.get("maxSubjectLength"), 0);
    }

    public boolean u()
    {
        return g.a((Boolean)d.get("enableGroupMms"), false);
    }

    public boolean v()
    {
        return g.a((Boolean)d.get("supportMmsContentDisposition"), false);
    }

    public boolean w()
    {
        return g.a((Boolean)d.get("config_cellBroadcastAppLinks"), false);
    }

    public String x()
    {
        return c("naiSuffix");
    }

    static 
    {
        hnc hnc = eev.r;
        c = new HashMap();
        c.put("enabledMMS", Boolean.valueOf(true));
        c.put("enabledTransID", Boolean.valueOf(false));
        c.put("enabledNotifyWapMMSC", Boolean.valueOf(false));
        c.put("aliasEnabled", Boolean.valueOf(false));
        c.put("allowAttachAudio", Boolean.valueOf(true));
        c.put("enableMultipartSMS", Boolean.valueOf(true));
        c.put("enableSMSDeliveryReports", Boolean.valueOf(true));
        c.put("enableGroupMms", Boolean.valueOf(true));
        c.put("supportMmsContentDisposition", Boolean.valueOf(true));
        c.put("config_cellBroadcastAppLinks", Boolean.valueOf(true));
        c.put("sendMultipartSmsAsSeparateMessages", Boolean.valueOf(false));
        c.put("enableMMSReadReports", Boolean.valueOf(false));
        c.put("enableMMSDeliveryReports", Boolean.valueOf(false));
        c.put("maxMessageSize", Integer.valueOf(0x4b000));
        c.put("maxImageHeight", Integer.valueOf(480));
        c.put("maxImageWidth", Integer.valueOf(640));
        c.put("recipientLimit", Integer.valueOf(0x7fffffff));
        c.put("httpSocketTimeout", Integer.valueOf(60000));
        c.put("aliasMinChars", Integer.valueOf(2));
        c.put("aliasMaxChars", Integer.valueOf(48));
        c.put("smsToMmsTextThreshold", Integer.valueOf(-1));
        c.put("smsToMmsTextLengthThreshold", Integer.valueOf(-1));
        c.put("maxMessageTextSize", Integer.valueOf(-1));
        c.put("maxSubjectLength", Integer.valueOf(40));
        c.put("mUaProfTagName", "x-wap-profile");
        c.put("httpParams", null);
        c.put("emailGatewayNumber", null);
        c.put("naiSuffix", null);
    }
}
