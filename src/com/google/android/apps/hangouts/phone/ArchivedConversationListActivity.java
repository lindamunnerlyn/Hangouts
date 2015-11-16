// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import clo;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import cra;
import dcn;
import gqu;

public class ArchivedConversationListActivity extends clo
{

    public ArchivedConversationListActivity()
    {
    }

    public void a(String s, boolean flag, int i, int j)
    {
        (new cra(this, dcn.e(n.a()), s, flag, i, j)).a(new Void[0]);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o.a(2);
    }
}
