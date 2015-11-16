// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class fql
    implements android.view.View.OnClickListener
{

    final SelectedAccountNavigationView a;

    public fql(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a = selectedaccountnavigationview;
        super();
    }

    public void onClick(View view)
    {
        SelectedAccountNavigationView.a(a, 1);
    }
}
