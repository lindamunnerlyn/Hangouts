// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class cda
{

    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final long g;
    public final List h = new ArrayList();
    public int i;
    public final boolean j;
    public final String k;
    public final int l;
    public final long m;

    public cda(String s, String s1, int i1, String s2, long l1, boolean flag, 
            int j1, String s3, int k1, long l2)
    {
        a = s;
        b = s1;
        e = i1;
        boolean flag1;
        if (e == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c = flag1;
        d = j1;
        f = s2;
        g = l1;
        i = 0;
        j = flag;
        k = s3;
        l = k1;
        m = l2;
        if (cdu.b)
        {
            s = a;
            s1 = f;
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(s1).length())).append("Conversation Line: ").append(s).append(" ").append(s1).toString());
        }
    }

    static String a(Cursor cursor, int i1, int j1)
    {
        String s1 = cursor.getString(i1);
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = cursor.getString(j1);
        }
        return s;
    }

    cel a()
    {
        if (h.size() > 0)
        {
            return ((ceb)h.get(0)).p;
        } else
        {
            return cel.b;
        }
    }

    boolean b()
    {
        return l == 1;
    }
}
