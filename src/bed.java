// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public final class bed
    implements beb
{

    String a;
    String b;
    boolean c;

    bed(String s, String s1, boolean flag)
    {
        a = s;
        b = s1;
        c = flag;
    }

    private String a()
    {
        String s = String.valueOf("FEATURE_ENABLED.");
        String s1 = String.valueOf(a);
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public Object a(Context context, Class class1, Class class2)
    {
        if (a(context))
        {
            class2 = ((Class) (hgx.b(context, class2)));
        } else
        {
            class2 = null;
        }
        if (class2 != null)
        {
            return class2;
        } else
        {
            return hgx.a(context, class1);
        }
    }

    public Object a(Context context, Object obj)
    {
        if (a(context))
        {
            return obj;
        } else
        {
            return null;
        }
    }

    public boolean a(Context context)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        if (!context.contains(a()))
        {
            return c;
        } else
        {
            return context.getBoolean(a(), false);
        }
    }

    public Object[] a(Context context, Class class1, Object obj)
    {
        if (a(context))
        {
            context = ((Context) ((Object[])Array.newInstance(class1, 1)));
            context[0] = obj;
            return context;
        } else
        {
            return (Object[])Array.newInstance(class1, 0);
        }
    }

    public Object[] a(Context context, Class class1, Collection collection)
    {
        if (a(context))
        {
            return collection.toArray((Object[])Array.newInstance(class1, 0));
        } else
        {
            return (Object[])Array.newInstance(class1, 0);
        }
    }

    public transient Object[] a(Context context, Class class1, Object aobj[])
    {
        if (a(context))
        {
            return Arrays.copyOf(aobj, 2);
        } else
        {
            return (Object[])Array.newInstance(class1, 0);
        }
    }
}
