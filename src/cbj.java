// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public final class cbj
    implements fsn, hhi, hjw
{

    private final Activity a;
    private gmo b;

    public cbj(Activity activity, hjm hjm1)
    {
        a = activity;
        hjm1.a(this);
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        b = (gmo)hgx1.a(gmo);
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            menuitem = bu.b(a);
            menuitem.putExtra("account_id", b.a());
            if (bu.a(a, menuitem))
            {
                dv.a(a).b(menuitem).b();
            } else
            {
                bu.b(a, menuitem);
            }
            return true;
        } else
        {
            return false;
        }
    }
}
