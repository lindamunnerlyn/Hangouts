// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;
import com.google.android.apps.hangouts.mergedcontacts.impl.MergedContactProviderImpl;

public final class cbo extends MergeContactsService
{

    final MergedContactProviderImpl d;

    public cbo(MergedContactProviderImpl mergedcontactproviderimpl)
    {
        d = mergedcontactproviderimpl;
        super();
    }

    public Context getApplicationContext()
    {
        return d.getContext();
    }

    public ContentResolver getContentResolver()
    {
        return d.getContext().getContentResolver();
    }
}
