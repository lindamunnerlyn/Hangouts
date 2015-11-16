// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class hbx
    implements fsn, hbw, hcl, hhi, hjx, hka
{

    private gpo a;
    private final SparseArray b = new SparseArray();
    private hci c;
    private Context d;

    hbx(hjm hjm1)
    {
        hjm1.a(this);
    }

    static hci a(hbx hbx1)
    {
        return hbx1.c;
    }

    static void a(hbx hbx1, int i, hcc hcc1)
    {
        hbx1 = (hcf)hbx1.b.get(i);
        if (hbx1 != null)
        {
            hbx1.a(hcc1.a());
        }
    }

    public void E_()
    {
        c.a(this);
        a.a(new hby(this));
    }

    public hbw a(int i, hcf hcf1)
    {
        if (b.get(i) != null)
        {
            hcf1 = String.valueOf("Cannot register more than one handler for a given  id: ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(hcf1).length() + 11)).append(hcf1).append(i).toString());
        } else
        {
            b.put(i, hcf1);
            return this;
        }
    }

    public void a()
    {
        c.b(this);
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        d = context;
        c = (hci)hgx1.a(hci);
        a = (gpo)hgx1.a(gpo);
    }

    public void a(hce hce, int i, List list)
    {
        HashSet hashset = new HashSet();
        hashset.add("org.robolectric.default");
        hashset.add("com.google.android.talk");
        hashset.add("com.google.android.apps.hangouts");
        hashset.add("com.google.android.apps.plus");
        String s = d.getPackageName();
        if (!hashset.contains(s))
        {
            hce = String.valueOf(s);
            if (hce.length() != 0)
            {
                hce = "Not whitelisted for requestPermissions: ".concat(hce);
            } else
            {
                hce = new String("Not whitelisted for requestPermissions: ");
            }
            throw new IllegalStateException(hce);
        }
        a.a(i);
        if ((hcf)b.get(i) == null)
        {
            throw new IllegalStateException((new StringBuilder(115)).append("You must register a result handler for request code").append(i).append(" before requesting permissions with that request code").toString());
        } else
        {
            i = a.b(i);
            c.a(hce, i, list);
            return;
        }
    }

    public boolean a(hcc hcc1)
    {
        return a.a(hcc1.a, new hbz(this, hcc1));
    }
}
