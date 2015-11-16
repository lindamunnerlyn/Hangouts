// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import g;
import hrj;
import hrq;
import hrx;
import hry;
import hsc;
import hsk;
import hsx;
import htg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import l;

// Referenced classes of package com.google.api.client.http:
//            HttpMediaType

public class UrlEncodedParser
    implements hsx
{

    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String MEDIA_TYPE;

    public UrlEncodedParser()
    {
    }

    public static void parse(Reader reader, Object obj)
    {
        GenericData genericdata;
        Object obj1;
        Object obj2;
        Object obj4;
        hry hry1;
        List list;
        hrq hrq1;
        boolean flag;
        int i;
        obj1 = obj.getClass();
        hry1 = hry.a(((Class) (obj1)));
        list = Arrays.asList(new Type[] {
            obj1
        });
        StringWriter stringwriter;
        if (com/google/api/client/util/GenericData.isAssignableFrom(((Class) (obj1))))
        {
            genericdata = (GenericData)obj;
        } else
        {
            genericdata = null;
        }
        if (java/util/Map.isAssignableFrom(((Class) (obj1))))
        {
            obj1 = (Map)obj;
        } else
        {
            obj1 = null;
        }
        hrq1 = new hrq(obj);
        obj2 = new StringWriter();
        stringwriter = new StringWriter();
        flag = true;
        obj4 = obj2;
        obj2 = stringwriter;
_L10:
        i = reader.read();
        i;
        JVM INSTR lookupswitch 3: default 132
    //                   -1: 157
    //                   38: 157
    //                   61: 463;
           goto _L1 _L2 _L2 _L3
_L1:
        Object obj3;
        hsk hsk1;
        Object obj5;
        if (flag)
        {
            ((StringWriter) (obj4)).write(i);
        } else
        {
            ((StringWriter) (obj2)).write(i);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj5 = htg.b(((StringWriter) (obj4)).toString());
        if (((String) (obj5)).length() == 0) goto _L5; else goto _L4
_L4:
        obj4 = htg.b(((StringWriter) (obj2)).toString());
        hsk1 = hry1.a(((String) (obj5)));
        if (hsk1 == null) goto _L7; else goto _L6
_L6:
        obj5 = hsc.a(list, hsk1.c());
        if (g.a(((Type) (obj5))))
        {
            obj2 = g.a(list, g.b(((Type) (obj5))));
            hrq1.a(hsk1.a(), ((Class) (obj2)), parseValue(((Type) (obj2)), list, ((String) (obj4))));
        } else
        if (g.a(g.a(list, ((Type) (obj5))), java/lang/Iterable))
        {
            obj3 = (Collection)hsk1.a(obj);
            obj2 = obj3;
            if (obj3 == null)
            {
                obj2 = hsc.b(((Type) (obj5)));
                hsk1.a(obj, obj2);
            }
            if (obj5 == java/lang/Object)
            {
                obj3 = null;
            } else
            {
                obj3 = g.c(((Type) (obj5)));
            }
            ((Collection) (obj2)).add(parseValue(((Type) (obj3)), list, ((String) (obj4))));
        } else
        {
            hsk1.a(obj, parseValue(((Type) (obj5)), list, ((String) (obj4))));
        }
_L5:
        obj4 = new StringWriter();
        obj2 = new StringWriter();
        if (i == -1)
        {
            hrq1.a();
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (obj1 != null)
        {
            obj3 = (ArrayList)((Map) (obj1)).get(obj5);
            obj2 = obj3;
            if (obj3 == null)
            {
                obj2 = new ArrayList();
                if (genericdata != null)
                {
                    genericdata.set(((String) (obj5)), obj2);
                } else
                {
                    ((Map) (obj1)).put(obj5, obj2);
                }
            }
            ((ArrayList) (obj2)).add(obj4);
        }
        if (true) goto _L5; else goto _L8
_L3:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L8:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static void parse(String s, Object obj)
    {
        if (s == null)
        {
            return;
        }
        try
        {
            parse(((Reader) (new StringReader(s))), obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw hrj.a(s);
        }
    }

    private static Object parseValue(Type type, List list, String s)
    {
        return hsc.a(hsc.a(list, type), s);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Class class1)
    {
        return parseAndClose(((Reader) (new InputStreamReader(inputstream, charset))), class1);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Type type)
    {
        return parseAndClose(((Reader) (new InputStreamReader(inputstream, charset))), type);
    }

    public Object parseAndClose(Reader reader, Class class1)
    {
        return parseAndClose(reader, ((Type) (class1)));
    }

    public Object parseAndClose(Reader reader, Type type)
    {
        l.a(type instanceof Class, "dataType has to be of type Class<?>");
        type = ((Type) (g.a((Class)type)));
        parse(new BufferedReader(reader), type);
        return type;
    }

    static 
    {
        MEDIA_TYPE = (new HttpMediaType("application/x-www-form-urlencoded")).setCharsetParameter(hrx.a).build();
    }
}
