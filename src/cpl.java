// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public interface cpl
{

    public abstract void a(Menu menu);

    public abstract void a(MenuInflater menuinflater, Menu menu);

    public abstract boolean a(Activity activity, MenuItem menuitem);
}