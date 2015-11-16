// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import aoa;
import bq;
import br;
import coz;
import dcn;
import eev;
import em;
import hmo;
import l;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            BabelGatewayActivity

public class BabelProfileActionActivity extends hmo
    implements br
{

    private static final String j[] = {
        "account_name", "sourceid", "data5", "display_name"
    };

    public BabelProfileActionActivity()
    {
    }

    public void a(Cursor cursor)
    {
        if (cursor == null || !cursor.moveToFirst())
        {
            Toast.makeText(this, l.hN, 0).show();
            finish();
            return;
        }
        String s = cursor.getString(1);
        if (TextUtils.isEmpty(s) || !s.startsWith("g:"))
        {
            Toast.makeText(this, l.hN, 0).show();
            finish();
            return;
        }
        s = s.substring(2);
        Object obj = dcn.a(cursor.getString(0), null);
        int i;
        if (obj != null)
        {
            i = ((aoa) (obj)).h();
        } else
        {
            i = -1;
        }
        obj = cursor.getString(2);
        cursor = cursor.getString(3);
        if ("conversation".equals(obj))
        {
            cursor = BabelGatewayActivity.a(i, s, cursor, null, false, null);
            cursor.addFlags(0x2000000);
            startActivity(cursor);
        } else
        if ("hangout".equals(obj))
        {
            cursor = BabelGatewayActivity.a(i, s, cursor, null, null, 51, 0);
            cursor.addFlags(0x2000000);
            startActivity(cursor);
        } else
        {
            cursor = String.valueOf(obj);
            if (cursor.length() != 0)
            {
                cursor = "Unrecognized profile command: ".concat(cursor);
            } else
            {
                cursor = new String("Unrecognized profile command: ");
            }
            eev.g("Babel", cursor);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getData();
        if (bundle == null)
        {
            finish();
            return;
        } else
        {
            Bundle bundle1 = new Bundle();
            bundle1.putParcelable("data_uri", bundle);
            f().a(0, bundle1, this);
            return;
        }
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new coz(this, null, (Uri)bundle.getParcelable("data_uri"), j, null, null, null);
    }

    public void onLoadFinished(em em, Object obj)
    {
        a((Cursor)obj);
    }

    public void onLoaderReset(em em)
    {
    }

}
