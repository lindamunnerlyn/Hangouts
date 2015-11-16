// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Comparator;

final class aze
    implements Comparator
{

    final aza a;

    aze(aza aza)
    {
        a = aza;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (asa)obj;
        obj1 = (asa)obj1;
        cfz cfz1 = ((asa) (obj)).h;
        cfz cfz2 = ((asa) (obj1)).h;
        if (TextUtils.isEmpty(cfz1.b()) || !TextUtils.isEmpty(cfz2.b()))
        {
            if (TextUtils.isEmpty(cfz1.b()) && !TextUtils.isEmpty(cfz2.b()))
            {
                return 1;
            }
            if (!TextUtils.isEmpty(((asa) (obj)).e) && !TextUtils.isEmpty(((asa) (obj1)).e))
            {
                aoz aoz = ((asa) (obj)).i;
                aoz aoz1 = ((asa) (obj1)).i;
                if (aoz == null && aoz1 != null)
                {
                    return 1;
                }
                if (aoz == null || aoz1 != null)
                {
                    return ((asa) (obj)).e.compareTo(((asa) (obj1)).e);
                }
            } else
            {
                return 0;
            }
        }
        return -1;
    }
}
