// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hlo
    implements hlw
{

    private static final int a = 7;
    private static final int b = 7;
    private final hlw c[];

    public hlo(Context context, Set set)
    {
        Object obj1 = context.getPackageName();
        Object obj;
        HashSet hashset;
        try
        {
            obj = context.getPackageManager().getApplicationInfo(((String) (obj1)), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf(String.format("Could not find application info for package: %s", new Object[] {
                obj1
            }), context);
            obj = null;
        }
        if (obj == null)
        {
            context = null;
        } else
        {
            context = ((ApplicationInfo) (obj)).metaData;
        }
        obj1 = new ArrayList();
        hashset = new HashSet();
        if (context != null)
        {
            Iterator iterator = ((ApplicationInfo) (obj)).metaData.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (String)iterator.next();
                if (((String) (obj)).startsWith("MODULE."))
                {
                    ((List) (obj1)).add(a(context.getString(((String) (obj)))));
                }
                if (((String) (obj)).startsWith("MODULE:"))
                {
                    ((List) (obj1)).add(a(((String) (obj)).substring(a)));
                } else
                if (((String) (obj)).startsWith("module:"))
                {
                    String s1 = ((String) (obj)).substring(b);
                    hashset.add(s1);
                    if (set == null || !set.contains(s1))
                    {
                        String s = String.valueOf("gen_binder.");
                        String s2 = String.valueOf(s1.replace('.', '$'));
                        if (s2.length() != 0)
                        {
                            s = s.concat(s2);
                        } else
                        {
                            s = new String(s);
                        }
                        ((List) (obj1)).add(a(s));
                        if (set != null && Log.isLoggable("Binder", 5))
                        {
                            s = String.valueOf(s1);
                            if (s.length() != 0)
                            {
                                "***WARNING*** Root module does not include ".concat(s);
                            } else
                            {
                                new String("***WARNING*** Root module does not include ");
                            }
                        }
                    }
                }
            } while (true);
        }
        c = (hlw[])((List) (obj1)).toArray(new hlw[((List) (obj1)).size()]);
    }

    private static hlw a(String s)
    {
        hlw hlw1;
        try
        {
            hlw1 = (hlw)Class.forName(s).newInstance();
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to add stitch module ".concat(s);
            } else
            {
                s = new String("Failed to add stitch module ");
            }
            throw new RuntimeException(s, illegalaccessexception);
        }
        catch (InstantiationException instantiationexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to add stitch module ".concat(s);
            } else
            {
                s = new String("Failed to add stitch module ");
            }
            throw new RuntimeException(s, instantiationexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Failed to add stitch module ".concat(s);
            } else
            {
                s = new String("Failed to add stitch module ");
            }
            throw new RuntimeException(s, classnotfoundexception);
        }
        return hlw1;
    }

    public void a(Context context, Class class1, hlp hlp)
    {
        for (int i = 0; i < c.length; i++)
        {
            c[i].a(context, class1, hlp);
        }

    }

}
