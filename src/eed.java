// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Spannable;
import java.util.Comparator;

final class eed
    implements Comparator
{

    Spannable a;

    eed(Spannable spannable)
    {
        a = spannable;
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (eec)obj;
        obj1 = (eec)obj1;
        int i = a.getSpanStart(obj);
        int j = a.getSpanStart(obj1);
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }
}
