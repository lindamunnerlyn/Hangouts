// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.view.View;

public final class eco
{

    private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final String b[] = {
        "android_id"
    };
    private static int c = -1;
    private static int d = -1;
    private static int e = -1;

    public static int a(Context context)
    {
        if (e == -1)
        {
            context = context.getResources();
            int i = context.getIdentifier("status_bar_height", "dimen", "android");
            if (i > 0)
            {
                i = context.getDimensionPixelSize(i);
            } else
            {
                i = 0;
            }
            e = i;
        }
        return e;
    }

    private static int a(Resources resources, boolean flag)
    {
        String s;
        int i;
        if (flag)
        {
            s = "navigation_bar_height";
        } else
        {
            s = "navigation_bar_height_landscape";
        }
        i = resources.getIdentifier(s, "dimen", "android");
        if (i > 0)
        {
            return resources.getDimensionPixelSize(i);
        } else
        {
            return 0;
        }
    }

    public static int a(View view, Context context)
    {
        if ((view.getSystemUiVisibility() & 2) != 0 || !c(context) && !ecn.c())
        {
            return 0;
        } else
        {
            return b(context);
        }
    }

    public static long a()
    {
        long l1 = 0L;
        Cursor cursor = g.nU.getContentResolver().query(a, null, null, b, null);
        long l;
        l = l1;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        l = l1;
        String s;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s = cursor.getString(1);
        Object obj;
        if (s != null)
        {
            try
            {
                l = Long.parseLong(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                l = l1;
            }
            finally { }
        } else
        {
            l = 0L;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return l;
        obj;
        cursor = null;
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
    }

    public static void a(View view)
    {
        int j = view.getSystemUiVisibility() | 1;
        int i = j;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            i = j | 4 | 0x400;
        }
        j = i;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            j = i | 2 | 0x200 | 0x800;
        }
        view.setSystemUiVisibility(j);
    }

    public static void a(View view, boolean flag)
    {
        int j = view.getSystemUiVisibility() & -2;
        int i = j;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            i = j & -5;
            if (flag)
            {
                i |= 0x400;
            } else
            {
                i &= 0xfffffbff;
            }
        }
        j = i;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            i &= -3;
            if (flag)
            {
                i |= 0x200;
            } else
            {
                i &= 0xfffffdff;
            }
            j = i & 0xfffff7ff;
        }
        view.setSystemUiVisibility(j);
    }

    public static int b(Context context)
    {
        int i = 0;
        if (c == -1 || d == -1)
        {
            Resources resources = context.getResources();
            c = a(resources, true);
            if (ecn.c())
            {
                i = a(resources, false);
            }
            d = i;
        }
        if (c(context))
        {
            return c;
        } else
        {
            return d;
        }
    }

    public static String b()
    {
        Object obj = (TelephonyManager)g.nU.getSystemService("phone");
        if (obj != null)
        {
            try
            {
                obj = ((TelephonyManager) (obj)).getNetworkOperator();
            }
            catch (Exception exception)
            {
                return "none";
            }
            return ((String) (obj));
        } else
        {
            return "none";
        }
    }

    public static boolean c(Context context)
    {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean d(Context context)
    {
        return context.getResources().getConfiguration().keyboard == 1;
    }

}
