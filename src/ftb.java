// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.regex.Pattern;

public final class ftb extends epl
    implements fto
{

    public static final String c[] = {
        "_id", "qualified_id", "gaia_id", "name", "sort_key", "sort_key_irank", "avatar", "profile_type", "v_circle_ids", "blocked", 
        "in_viewer_domain", "last_modified", "name_verified", "given_name", "family_name", "affinity1", "affinity2", "affinity3", "affinity4", "affinity5", 
        "people_in_common", "v_emails", "v_phones"
    };
    private final Bundle d;
    private final fre e;
    private final frd f;
    private final boolean g;

    public ftb(DataHolder dataholder, int j, Bundle bundle, fre fre1, frd frd1)
    {
        super(dataholder, j);
        d = bundle;
        e = fre1;
        f = frd1;
        g = d.getBoolean("emails_with_affinities", false);
    }

    public Iterable c()
    {
        return f.a(b("v_emails"), g);
    }

    public Iterable d()
    {
        return e.a(b("v_phones"), false);
    }

    public String[] i()
    {
        String s = b("v_circle_ids");
        if (TextUtils.isEmpty(s))
        {
            return fst.d;
        } else
        {
            return fst.e.split(s, -1);
        }
    }

}
