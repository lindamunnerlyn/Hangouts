// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class cif
    implements android.view.View.OnClickListener
{

    final View a;
    final cic b;

    cif(cic cic1, View view)
    {
        b = cic1;
        a = view;
        super();
    }

    public void onClick(View view)
    {
        a.setVisibility(8);
        view = (cjg)cic.d(b).a(cjg);
        ArrayList arraylist = new ArrayList();
        arraylist.add("android.permission.READ_CONTACTS");
        arraylist.add("android.permission.WRITE_CONTACTS");
        view.a(l.tY, arraylist, 2653, null);
    }
}
