// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class gpo
    implements fsn, hhi, hjt, hkb
{

    private gpw a;
    private gpt b;
    private gpv c;

    public gpo(hjm hjm1)
    {
        hjm1.a(this);
    }

    public void a(int i)
    {
        if (TextUtils.isEmpty(c.a(i)))
        {
            throw new IllegalArgumentException("You must use a resource id as the request code to guarantee overlap does not occur");
        } else
        {
            return;
        }
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        a = (gpw)hgx1.a(gpw);
        c = (gpv)hgx1.a(gpv);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (gpt)bundle.getParcelable("requestcodehelper_pending_requests");
            return;
        } else
        {
            b = new gpt();
            return;
        }
    }

    public void a(gpp gpp1)
    {
        Integer integer;
        Integer integer1;
        for (Iterator iterator = (new ArrayList(b.a())).iterator(); iterator.hasNext(); gpp1.a(integer.intValue(), integer1.intValue()))
        {
            integer = (Integer)iterator.next();
            integer1 = b.a(integer);
        }

    }

    public boolean a(int i, gps gps1)
    {
        for (Iterator iterator = b.a().iterator(); iterator.hasNext();)
        {
            Integer integer = (Integer)iterator.next();
            if (b.a(integer).intValue() == i)
            {
                gps1.a(integer.intValue());
                return true;
            }
        }

        return false;
    }

    public int b(int i)
    {
        Integer integer1 = b.a(Integer.valueOf(i));
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(a.a());
            b.a(Integer.valueOf(i), integer);
        }
        return integer.intValue();
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("requestcodehelper_pending_requests", b);
    }
}
