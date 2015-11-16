// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class amf
    implements Serializable
{

    public String a;

    public amf()
    {
        a = "";
    }

    public abstract aml a();

    public abstract Collection b();

    public abstract String c();

    public abstract Collection d();

    public abstract String e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract String i();

    public abstract Collection j();

    public abstract String k();

    public abstract boolean l();

    public abstract String m();

    public abstract boolean n();

    public abstract boolean o();

    public Collection p()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b().iterator(); iterator.hasNext(); arraylist.add(daf.a(((aml)iterator.next()).b()))) { }
        ame ame1;
        for (Iterator iterator1 = j().iterator(); iterator1.hasNext(); arraylist.add(daf.a(ame1.a(), ame1.e())))
        {
            ame1 = (ame)iterator1.next();
        }

        return arraylist;
    }

    public boolean q()
    {
        return !b().isEmpty();
    }

    public int r()
    {
        if (TextUtils.isEmpty(a))
        {
            return amg.a;
        }
        if (Patterns.EMAIL_ADDRESS.matcher(a).matches())
        {
            return amg.c;
        }
        if (ebz.m(a) != null)
        {
            return amg.d;
        }
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            if (((amd)iterator.next()).b().contains(a))
            {
                return amg.c;
            }
        }

        for (Iterator iterator1 = b().iterator(); iterator1.hasNext();)
        {
            if (((aml)iterator1.next()).d().contains(a))
            {
                return amg.d;
            }
        }

        return amg.b;
    }

    public String toString()
    {
        String s = String.valueOf(ebw.b(e()));
        String s1 = String.valueOf(ebw.b(f()));
        String s2 = String.valueOf(Arrays.toString(j().toArray()));
        String s3 = String.valueOf(ebw.b(k()));
        String s4 = String.valueOf(ebw.b(m()));
        String s5 = String.valueOf(Arrays.toString(d().toArray()));
        String s6 = String.valueOf(Arrays.toString(b().toArray()));
        String s7 = String.valueOf(Arrays.toString(p().toArray()));
        return (new StringBuilder(String.valueOf(s).length() + 126 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append("HangoutsContact {name: ").append(s).append(" | avatarUrl: ").append(s1).append(" | gaias: ").append(s2).append(" | contactLookupKey: ").append(s3).append(" | contactId: ").append(s4).append(" | emails: ").append(s5).append(" | phoneNumbers: ").append(s6).append(" | inviteeIds: ").append(s7).append("}").toString();
    }
}
