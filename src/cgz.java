// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class cgz
    implements android.view.View.OnClickListener
{

    final View a;
    final cgw b;

    cgz(cgw cgw1, View view)
    {
        b = cgw1;
        a = view;
        super();
    }

    public void onClick(View view)
    {
        a.setVisibility(8);
        view = (cia)cgw.d(b).a(cia);
        ArrayList arraylist = new ArrayList();
        arraylist.add("android.permission.READ_CONTACTS");
        arraylist.add("android.permission.WRITE_CONTACTS");
        view.a(l.uH, arraylist, 2653, null);
    }
}
