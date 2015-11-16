// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class jd extends jc
{

    jd()
    {
    }

    public boolean b(MenuItem menuitem)
    {
        return menuitem.expandActionView();
    }

    public boolean c(MenuItem menuitem)
    {
        return menuitem.isActionViewExpanded();
    }
}
