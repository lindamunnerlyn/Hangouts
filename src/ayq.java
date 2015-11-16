// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Comparator;

final class ayq
    implements Comparator
{

    final aym a;

    ayq(aym aym)
    {
        a = aym;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (ark)obj;
        obj1 = (ark)obj1;
        ceu ceu1 = ((ark) (obj)).h;
        ceu ceu2 = ((ark) (obj1)).h;
        if (TextUtils.isEmpty(ceu1.b()) || !TextUtils.isEmpty(ceu2.b()))
        {
            if (TextUtils.isEmpty(ceu1.b()) && !TextUtils.isEmpty(ceu2.b()))
            {
                return 1;
            }
            if (!TextUtils.isEmpty(((ark) (obj)).e) && !TextUtils.isEmpty(((ark) (obj1)).e))
            {
                aoh aoh = ((ark) (obj)).i;
                aoh aoh1 = ((ark) (obj1)).i;
                if (aoh == null && aoh1 != null)
                {
                    return 1;
                }
                if (aoh == null || aoh1 != null)
                {
                    return ((ark) (obj)).e.compareTo(((ark) (obj1)).e);
                }
            } else
            {
                return 0;
            }
        }
        return -1;
    }
}
