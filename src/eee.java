// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class eee
{

    private static final boolean a = false;

    public static int a(int i)
    {
        return i;
    }

    public static int a(int i, int j, int k, String s)
    {
        if (i == -1)
        {
            return k;
        }
        Object obj = g.nU.getSharedPreferences("notificationRequestCodes.v1", 0);
        int l;
        int i1;
        if (s == null)
        {
            s = String.valueOf("|");
            s = (new StringBuilder(String.valueOf(s).length() + 22)).append(i).append(s).append(k).toString();
        } else
        {
            String s1 = String.valueOf("|");
            String s2 = String.valueOf("|");
            s = (new StringBuilder(String.valueOf(s1).length() + 22 + String.valueOf(s2).length() + String.valueOf(s).length())).append(i).append(s1).append(k).append(s2).append(s).toString();
        }
        i1 = ((SharedPreferences) (obj)).getInt(s, 0);
        l = i1;
        if (i1 == 0)
        {
            int j1 = ((SharedPreferences) (obj)).getInt("maxRequestCode", 1001) + 1;
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("maxRequestCode", (j1 + j) - 1);
            ((android.content.SharedPreferences.Editor) (obj)).putInt(s, j1);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
            l = j1;
            if (a)
            {
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 118)).append("New Request code assigned for account=").append(i).append(" numReserved=").append(j).append(" type=").append(k).append(" assigned=").append(j1).append(" (key=").append(s).append(")").toString());
                l = j1;
            }
        }
        return l;
    }

    static 
    {
        hnc hnc = eev.u;
    }
}
