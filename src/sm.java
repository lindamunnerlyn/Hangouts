// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class sm extends MenuInflater
{

    private static final Class a[];
    private static final Class b[];
    private final Object c[];
    private final Object d[];
    private Context e;
    private Object f;

    public sm(Context context)
    {
        super(context);
        e = context;
        c = (new Object[] {
            context
        });
        d = c;
    }

    static Context a(sm sm1)
    {
        return sm1.e;
    }

    private void a(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
    {
        so so1;
        int i;
        so1 = new so(this, menu);
        i = xmlpullparser.getEventType();
_L12:
        if (i != 2) goto _L2; else goto _L1
_L1:
        menu = xmlpullparser.getName();
        if (!menu.equals("menu")) goto _L4; else goto _L3
_L3:
        i = xmlpullparser.next();
_L13:
        int j;
        int k;
        menu = null;
        boolean flag = false;
        k = i;
        j = 0;
        i = ((flag) ? 1 : 0);
_L10:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        k;
        JVM INSTR tableswitch 1 3: default 100
    //                   1 362
    //                   2 160
    //                   3 244;
           goto _L5 _L6 _L7 _L8
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break; /* Loop/switch isn't completed */
_L14:
        k = xmlpullparser.next();
        if (true) goto _L10; else goto _L9
_L4:
        throw new RuntimeException((new StringBuilder("Expecting menu, got ")).append(menu).toString());
_L2:
        j = xmlpullparser.next();
        i = j;
        if (j != 1) goto _L12; else goto _L11
_L11:
        i = j;
          goto _L13
_L9:
        if (i == 0)
        {
            String s = xmlpullparser.getName();
            if (s.equals("group"))
            {
                so1.a(attributeset);
            } else
            if (s.equals("item"))
            {
                so1.b(attributeset);
            } else
            if (s.equals("menu"))
            {
                a(xmlpullparser, attributeset, ((Menu) (so1.c())));
            } else
            {
                menu = s;
                i = 1;
            }
        }
          goto _L14
_L8:
        String s1 = xmlpullparser.getName();
        if (i != 0 && s1.equals(menu))
        {
            menu = null;
            i = 0;
        } else
        if (s1.equals("group"))
        {
            so1.a();
        } else
        if (s1.equals("item"))
        {
            if (!so1.d())
            {
                if (so1.a != null && so1.a.e())
                {
                    so1.c();
                } else
                {
                    so1.b();
                }
            }
        } else
        if (s1.equals("menu"))
        {
            j = 1;
        }
          goto _L14
_L6:
        throw new RuntimeException("Unexpected end of document");
          goto _L13
    }

    static Class[] a()
    {
        return b;
    }

    static Class[] b()
    {
        return a;
    }

    static Object[] b(sm sm1)
    {
        return sm1.d;
    }

    static Object c(sm sm1)
    {
        if (sm1.f == null)
        {
            Context context;
            for (context = sm1.e; !(context instanceof Activity) && (context instanceof ContextWrapper); context = ((ContextWrapper)context).getBaseContext()) { }
            sm1.f = context;
        }
        return sm1.f;
    }

    static Object[] d(sm sm1)
    {
        return sm1.c;
    }

    public void inflate(int i, Menu menu)
    {
        if (menu instanceof fr) goto _L2; else goto _L1
_L1:
        super.inflate(i, menu);
_L4:
        return;
_L2:
        XmlResourceParser xmlresourceparser;
        XmlResourceParser xmlresourceparser1;
        XmlResourceParser xmlresourceparser2;
        xmlresourceparser = null;
        xmlresourceparser2 = null;
        xmlresourceparser1 = null;
        XmlResourceParser xmlresourceparser3 = e.getResources().getLayout(i);
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        a(xmlresourceparser3, Xml.asAttributeSet(xmlresourceparser3), menu);
        if (xmlresourceparser3 != null)
        {
            xmlresourceparser3.close();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        menu;
        xmlresourceparser = xmlresourceparser1;
        throw new InflateException("Error inflating menu XML", menu);
        menu;
        if (xmlresourceparser != null)
        {
            xmlresourceparser.close();
        }
        throw menu;
        menu;
        xmlresourceparser = xmlresourceparser2;
        throw new InflateException("Error inflating menu XML", menu);
    }

    static 
    {
        Class aclass[] = new Class[1];
        aclass[0] = android/content/Context;
        a = aclass;
        b = aclass;
    }
}
