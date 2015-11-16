// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

final class ejq
    implements android.view.View.OnClickListener
{

    final aoa a;
    final ad b;
    final ejp c;

    ejq(ejp ejp1, aoa aoa1, ad ad1)
    {
        c = ejp1;
        a = aoa1;
        b = ad1;
        super();
    }

    public void onClick(View view)
    {
        view = a;
        String s = c.a;
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/ViewVCardActivity);
        if (view != null)
        {
            intent.putExtra("account_id", view.h());
        }
        intent.setData(Uri.parse(s));
        b.startActivity(intent);
    }
}
