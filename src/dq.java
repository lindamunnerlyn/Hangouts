// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;

final class dq
    implements dn
{

    dq()
    {
    }

    public Bundle a(Intent intent)
    {
        intent = intent.getClipData();
        if (intent != null)
        {
            ClipDescription clipdescription = intent.getDescription();
            if (clipdescription.hasMimeType("text/vnd.android.intent") && clipdescription.getLabel().equals("android.remoteinput.results"))
            {
                return (Bundle)intent.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
            }
        }
        return null;
    }
}
