// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class ccd
    implements fqe
{

    final NavigationDrawerFragment a;

    public ccd(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public fqd a(View view)
    {
        ccg ccg1 = new ccg();
        ccg1.a = view;
        ccg1.e = (ImageView)view.findViewById(h.D);
        ccg1.d = (TextView)view.findViewById(h.n);
        ccg1.b = (ImageView)view.findViewById(h.fD);
        ccg1.c = (ImageView)view.findViewById(h.I);
        return ccg1;
    }
}
