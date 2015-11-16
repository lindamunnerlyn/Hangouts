// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;

final class frg extends frj
{

    final frf a;

    frg(frf frf, Resources resources)
    {
        a = frf;
        super(resources);
    }

    protected String a(Resources resources, int i)
    {
        return (String)android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i, null);
    }
}
