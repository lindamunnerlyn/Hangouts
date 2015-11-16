// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

public final class acc
{

    private static final int a[] = {
        0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 
        12, 17, 18, 38, 39, 40, 106, 113, 114, 2025, 
        2026, 1000, 1015, 2085
    };
    private static final String b[] = {
        "*", "us-ascii", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", 
        "iso-8859-9", "shift_JIS", "euc-jp", "euc-kr", "iso-2022-jp", "iso-2022-jp-2", "utf-8", "gbk", "gb18030", "gb2312", 
        "big5", "iso-10646-ucs-2", "utf-16", "hz-gb-2312"
    };
    private static final SparseArray c;
    private static final hm d;

    public static int a(String s)
    {
        s = (Integer)d.get(s);
        if (s == null)
        {
            throw new UnsupportedEncodingException();
        } else
        {
            return s.intValue();
        }
    }

    public static String a(int i)
    {
        String s = (String)c.get(i);
        if (s == null)
        {
            throw new UnsupportedEncodingException();
        } else
        {
            return s;
        }
    }

    static 
    {
        int i = 0;
        c = new SparseArray();
        d = new hm();
        for (int j = a.length; i <= j - 1; i++)
        {
            c.put(a[i], b[i]);
            d.put(b[i], Integer.valueOf(a[i]));
        }

    }
}
