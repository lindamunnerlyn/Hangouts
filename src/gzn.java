// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class gzn
    implements gzm
{

    private final Context a;

    public gzn(Context context)
    {
        a = context;
    }

    public boolean a()
    {
        Object obj = gzc.a;
        obj = (guf)hgx.b(a, guf);
        if (obj != null)
        {
            List list = ((gms)hgx.a(a, gms)).a();
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                ((Integer)list.get(i)).intValue();
                if (((guf) (obj)).a())
                {
                    return true;
                }
            }

        }
        return false;
    }
}
