// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.google.android.apps.hangouts.permissions.impl.RationaleActivity;
import java.util.ArrayList;

public final class cju
    implements android.view.View.OnClickListener
{

    final RationaleActivity a;

    public cju(RationaleActivity rationaleactivity)
    {
        a = rationaleactivity;
        super();
    }

    public void onClick(View view)
    {
        if (view.getId() == g.nQ)
        {
            a.setResult(0, RationaleActivity.a(a));
            a.finish();
            return;
        } else
        {
            view = (ArrayList)a.getIntent().getSerializableExtra("permissions");
            a.j.a(g.nN, view, 0, null);
            return;
        }
    }
}
