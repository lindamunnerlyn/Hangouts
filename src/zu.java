// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;

public final class zu
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final ShareActionProvider a;

    public zu(ShareActionProvider shareactionprovider)
    {
        a = shareactionprovider;
        super();
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = ue.a(ShareActionProvider.a(a), ShareActionProvider.b(a)).b(menuitem.getItemId());
        if (menuitem != null)
        {
            String s = menuitem.getAction();
            if ("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s))
            {
                ShareActionProvider.a(menuitem);
            }
            ShareActionProvider.a(a).startActivity(menuitem);
        }
        return true;
    }
}
