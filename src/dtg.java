// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class dtg
{

    private static final Map a;
    private dth b;
    private dti c;
    private final StringBuilder d = new StringBuilder();
    private final XmlPullParser e;

    private dtg(XmlPullParser xmlpullparser)
    {
        e = xmlpullparser;
        b = null;
        c = null;
    }

    public static dtg a(XmlPullParser xmlpullparser)
    {
        gdv.b("Expected non-null", xmlpullparser);
        return new dtg(xmlpullparser);
    }

    private Boolean a(String s, String s1)
    {
        boolean flag;
        try
        {
            flag = Boolean.parseBoolean(s);
        }
        catch (Exception exception)
        {
            String s2 = String.valueOf(c());
            eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("Invalid value ").append(s).append("for").append(s1).append(" @").append(s2).toString());
            return null;
        }
        return Boolean.valueOf(flag);
    }

    private Integer a(String s, Integer integer, String s1)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        catch (Exception exception)
        {
            String s2 = String.valueOf(c());
            eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("Invalid value ").append(s).append("for").append(s1).append(" @").append(s2).toString());
            return integer;
        }
        return Integer.valueOf(i);
    }

    private void a(ContentValues contentvalues)
    {
        gdv.b("Expected non-null", contentvalues);
        contentvalues.clear();
        for (int i = 0; i < e.getAttributeCount(); i++)
        {
            String s = (String)a.get(e.getAttributeName(i));
            if (s != null)
            {
                contentvalues.put(s, e.getAttributeValue(i));
            }
        }

        contentvalues.put("numeric", dvc.a(contentvalues.getAsString("mcc"), contentvalues.getAsString("mnc")));
        String s1 = contentvalues.getAsString("authtype");
        if (s1 != null)
        {
            contentvalues.put("authtype", a(s1, Integer.valueOf(-1), "apn authtype"));
        }
        s1 = contentvalues.getAsString("carrier_enabled");
        if (s1 != null)
        {
            contentvalues.put("carrier_enabled", a(s1, "apn carrierEnabled"));
        }
        s1 = contentvalues.getAsString("bearer");
        if (s1 != null)
        {
            contentvalues.put("bearer", a(s1, Integer.valueOf(0), "apn bearer"));
        }
        if (e.next() != 3)
        {
            contentvalues = String.valueOf(c());
            if (contentvalues.length() != 0)
            {
                contentvalues = "Apn: expecting end tag @".concat(contentvalues);
            } else
            {
                contentvalues = new String("Apn: expecting end tag @");
            }
            throw new XmlPullParserException(contentvalues);
        }
        if (b != null)
        {
            b.a(contentvalues);
        }
    }

    private int b()
    {
        int i;
        do
        {
            i = e.next();
        } while (i != 2 && i != 1);
        return i;
    }

    private String c()
    {
        int i;
        i = 0;
        d.setLength(0);
        if (e == null) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        int j;
        j = e.getEventType();
        stringbuilder = d;
        j;
        JVM INSTR tableswitch 0 4: default 245
    //                   0 248
    //                   1 254
    //                   2 260
    //                   3 266
    //                   4 272;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_272;
_L3:
        Object obj = Integer.toString(j);
_L10:
        stringbuilder.append(((String) (obj)));
        if (j != 2 && j != 3 && j != 4)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        d.append('<').append(e.getName());
_L9:
        if (i >= e.getAttributeCount())
        {
            break MISSING_BLOCK_LABEL_181;
        }
        d.append(' ').append(e.getAttributeName(i)).append('=').append(e.getAttributeValue(i));
        i++;
          goto _L9
        d.append("/>");
        obj = d.toString();
        return ((String) (obj));
        obj;
        String s = String.valueOf(obj);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 23)).append("xmlParserDebugContext: ").append(s).toString(), ((Throwable) (obj)));
_L2:
        return "Unknown";
_L4:
        obj = "START_DOCUMENT";
          goto _L10
_L5:
        obj = "END_DOCUMENT";
          goto _L10
_L6:
        obj = "START_TAG";
          goto _L10
_L7:
        obj = "END_TAG";
          goto _L10
        obj = "TEXT";
          goto _L10
    }

    private void d()
    {
        String s1 = dvc.a(e.getAttributeValue(null, "mcc"), e.getAttributeValue(null, "mnc"));
        do
        {
            int i;
            do
            {
                i = e.next();
            } while (i == 4);
            if (i != 2)
            {
                break;
            }
            String s2 = e.getAttributeValue(null, "name");
            String s3 = e.getName();
            i = e.next();
            String s;
            if (i == 4)
            {
                s = e.getText();
                i = e.next();
            } else
            {
                s = null;
            }
            if (i != 3)
            {
                s = String.valueOf(c());
                if (s.length() != 0)
                {
                    s = "ApnsXmlProcessor: expecting end tag @".concat(s);
                } else
                {
                    s = new String("ApnsXmlProcessor: expecting end tag @");
                }
                throw new XmlPullParserException(s);
            }
            if (dtp.a().a(s2, s3))
            {
                if (c != null)
                {
                    c.a(s1, s2, s, s3);
                }
            } else
            {
                eev.f("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 32 + String.valueOf(s3).length())).append("MmsConfig: invalid key=").append(s2).append(" or type=").append(s3).toString());
            }
        } while (true);
        if (i != 3)
        {
            s = String.valueOf(c());
            if (s.length() != 0)
            {
                s = "MmsConfig: expecting start or end tag @".concat(s);
            } else
            {
                s = new String("MmsConfig: expecting start or end tag @");
            }
            throw new XmlPullParserException(s);
        } else
        {
            return;
        }
    }

    public dtg a(dth dth1)
    {
        b = dth1;
        return this;
    }

    public dtg a(dti dti1)
    {
        c = dti1;
        return this;
    }

    public void a()
    {
        if (b() == 2) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(c());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "ApnsXmlProcessor: expecting start tag @".concat(((String) (obj)));
_L5:
        throw new XmlPullParserException(((String) (obj)));
        obj;
        String s = String.valueOf(obj);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 30)).append("ApnsXmlProcessor: I/O failure ").append(s).toString(), ((Throwable) (obj)));
_L7:
        return;
_L4:
        obj = new String("ApnsXmlProcessor: expecting start tag @");
          goto _L5
        XmlPullParserException xmlpullparserexception;
        xmlpullparserexception;
        String s1 = String.valueOf(xmlpullparserexception);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 34)).append("ApnsXmlProcessor: parsing failure ").append(s1).toString(), xmlpullparserexception);
        return;
_L2:
        String s2;
        xmlpullparserexception = new ContentValues();
        s2 = e.getName();
        if (!"apns".equals(s2))
        {
            continue; /* Loop/switch isn't completed */
        }
_L10:
        if (b() != 2) goto _L7; else goto _L6
_L6:
        s2 = e.getName();
        if (!"apn".equals(s2)) goto _L9; else goto _L8
_L8:
        a(((ContentValues) (xmlpullparserexception)));
          goto _L10
_L9:
        if (!"mms_config".equals(s2)) goto _L10; else goto _L11
_L11:
        d();
          goto _L10
        if (!"mms_config".equals(s2)) goto _L7; else goto _L12
_L12:
        d();
        return;
          goto _L5
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("mcc", "mcc");
        a.put("mnc", "mnc");
        a.put("carrier", "name");
        a.put("apn", "apn");
        a.put("mmsc", "mmsc");
        a.put("mmsproxy", "mmsproxy");
        a.put("mmsport", "mmsport");
        a.put("type", "type");
        a.put("user", "user");
        a.put("password", "password");
        a.put("authtype", "authtype");
        a.put("mvno_match_data", "mvno_match_data");
        a.put("mvno_type", "mvno_type");
        a.put("protocol", "protocol");
        a.put("bearer", "bearer");
        a.put("server", "server");
        a.put("roaming_protocol", "roaming_protocol");
        a.put("proxy", "proxy");
        a.put("port", "port");
        a.put("carrier_enabled", "carrier_enabled");
    }
}
