// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;

final class fol extends fon
{

    final foj a;

    fol(foj foj, Resources resources)
    {
        a = foj;
        super(resources);
    }

    protected String a(Resources resources, int i)
    {
        return (String)android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, i, null);
    }
}
