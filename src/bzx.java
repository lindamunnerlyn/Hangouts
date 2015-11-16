// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentProvider;
import android.net.Uri;

public abstract class bzx extends ContentProvider
{

    public static final String a;
    public static final String b;
    public static final Uri c;
    public static final Uri d;
    public static final String e[];
    public static final String f[];
    public static final String g[];
    private static final String h;

    public bzx()
    {
    }

    private static String a(String s)
    {
        String s1 = String.valueOf("IFNULL(merged_contact_details.");
        return (new StringBuilder(String.valueOf(s1).length() + 5 + String.valueOf(s).length())).append(s1).append(s).append(", '')").toString();
    }

    public static String[] a()
    {
        return (new String[] {
            "CREATE TABLE merged_contacts (_id INTEGER PRIMARY KEY, contact_lookup_key TEXT, contact_id INT, raw_contact_id INT, display_name TEXT, avatar_url TEXT);", "CREATE TABLE merged_contact_details (_id INTEGER PRIMARY KEY, merged_contact_id INT, lookup_data_type INT, lookup_data TEXT, lookup_data_standardized TEXT, lookup_data_search TEXT, lookup_data_label TEXT, needs_gaia_ids_resolved INT DEFAULT (1), is_hangouts_user INT DEFAULT (0), gaia_id TEXT, avatar_url TEXT, display_name TEXT, last_checked_ts INT DEFAULT (0), FOREIGN KEY (merged_contact_id) REFERENCES merged_contacts(_id) ON DELETE CASCADE ON UPDATE CASCADE);"
        });
    }

    public static String[] b()
    {
        return (new String[] {
            "CREATE TABLE merged_contacts (_id INTEGER PRIMARY KEY, contact_lookup_key TEXT, contact_id INT, raw_contact_id INT, display_name TEXT, avatar_url TEXT, is_frequent INT DEFAULT (0),is_favorite INT DEFAULT (0));", "CREATE TABLE merged_contact_details (_id INTEGER PRIMARY KEY, merged_contact_id INT, lookup_data_type INT, lookup_data TEXT, lookup_data_display TEXT, lookup_data_standardized TEXT, lookup_data_search TEXT, lookup_data_label TEXT, needs_gaia_ids_resolved INT DEFAULT (1), is_hangouts_user INT DEFAULT (0), gaia_id TEXT, avatar_url TEXT, display_name TEXT, last_checked_ts INT DEFAULT (0), FOREIGN KEY (merged_contact_id) REFERENCES merged_contacts(_id) ON DELETE CASCADE ON UPDATE CASCADE);"
        });
    }

    public static String[] c()
    {
        return (new String[] {
            b
        });
    }

    public static String[] d()
    {
        return (new String[] {
            "merged_contacts_with_details"
        });
    }

    static 
    {
        Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        Object obj = "com.google.android.apps.hangouts.mergedcontacts.MergedContactProvider";
_L1:
        a = ((String) (obj));
        h = (new StringBuilder(String.valueOf(obj).length() + 11)).append("content://").append(((String) (obj))).append("/").toString();
        obj = String.valueOf("CREATE VIEW merged_contacts_with_details AS SELECT merged_contacts._id as _id, merged_contacts.contact_lookup_key as contact_lookup_key, merged_contacts.contact_id as contact_id, merged_contacts.raw_contact_id as raw_contact_id, merged_contacts.display_name as display_name, merged_contacts.avatar_url as avatar_url, merged_contacts.is_frequent as is_frequent, merged_contacts.is_favorite as is_favorite, max(merged_contact_details.needs_gaia_ids_resolved) as needs_gaia_ids_resolved, max(merged_contact_details.is_hangouts_user) as is_hangouts_user, max(case when merged_contact_details.lookup_data_type = 0 then 1 else 0 END ) as has_phone_number, group_concat(merged_contact_details.lookup_data_type || \"#DELIM2#\" || ");
        String s = a("lookup_data");
        String s1 = String.valueOf(" || \"#DELIM2#\" || ");
        String s2 = a("lookup_data_standardized");
        String s3 = String.valueOf(" || \"#DELIM2#\" || ");
        String s4 = a("lookup_data_label");
        String s5 = String.valueOf(" || \"#DELIM2#\" || ");
        String s6 = String.valueOf("merged_contact_details");
        String s7 = String.valueOf("needs_gaia_ids_resolved");
        String s8 = String.valueOf(" || \"#DELIM2#\" || ");
        String s9 = String.valueOf("merged_contact_details");
        String s10 = String.valueOf("is_hangouts_user");
        String s11 = String.valueOf(" || \"#DELIM2#\" || ");
        String s12 = a("gaia_id");
        String s13 = String.valueOf(" || \"#DELIM2#\" || ");
        String s14 = a("avatar_url");
        String s15 = String.valueOf(" || \"#DELIM2#\" || ");
        String s16 = a("display_name");
        String s17 = String.valueOf(" || \"#DELIM2#\" || ");
        String s18 = String.valueOf("merged_contact_details");
        String s19 = String.valueOf("last_checked_ts");
        String s20 = String.valueOf(" || \"#DELIM2#\" || ");
        String s21 = a("lookup_data_display");
        String s22 = String.valueOf("#DELIM1#");
        String s23 = String.valueOf(" as ");
        String s24 = String.valueOf("details");
        String s25 = String.valueOf("merged_contacts");
        String s26 = String.valueOf("merged_contact_details");
        String s27 = String.valueOf("merged_contact_details");
        String s28 = String.valueOf("merged_contact_id");
        String s29 = String.valueOf("merged_contacts");
        String s30 = String.valueOf("_id");
        String s31 = String.valueOf("merged_contacts");
        String s32 = String.valueOf("_id");
        String s33 = String.valueOf("merged_contacts");
        String s34 = String.valueOf("contact_lookup_key");
        String s35 = String.valueOf("merged_contacts");
        String s36 = String.valueOf("contact_id");
        String s37 = String.valueOf("merged_contacts");
        String s38 = String.valueOf("raw_contact_id");
        String s39 = String.valueOf("merged_contacts");
        String s40 = String.valueOf("display_name");
        String s41 = String.valueOf("merged_contacts");
        String s42 = String.valueOf("avatar_url");
        String s43 = String.valueOf("merged_contacts");
        String s44 = String.valueOf("is_frequent");
        String s45 = String.valueOf("merged_contacts");
        String s46 = String.valueOf("is_favorite");
        b = (new StringBuilder(String.valueOf(obj).length() + 67 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(s21).length() + String.valueOf(s22).length() + String.valueOf(s23).length() + String.valueOf(s24).length() + String.valueOf(s25).length() + String.valueOf(s26).length() + String.valueOf(s27).length() + String.valueOf(s28).length() + String.valueOf(s29).length() + String.valueOf(s30).length() + String.valueOf(s31).length() + String.valueOf(s32).length() + String.valueOf(s33).length() + String.valueOf(s34).length() + String.valueOf(s35).length() + String.valueOf(s36).length() + String.valueOf(s37).length() + String.valueOf(s38).length() + String.valueOf(s39).length() + String.valueOf(s40).length() + String.valueOf(s41).length() + String.valueOf(s42).length() + String.valueOf(s43).length() + String.valueOf(s44).length() + String.valueOf(s45).length() + String.valueOf(s46).length())).append(((String) (obj))).append(s).append(s1).append(s2).append(s3).append(s4).append(s5).append(s6).append(".").append(s7).append(s8).append(s9).append(".").append(s10).append(s11).append(s12).append(s13).append(s14).append(s15).append(s16).append(s17).append(s18).append(".").append(s19).append(s20).append(s21).append(", \"").append(s22).append("\") ").append(s23).append(s24).append(" FROM ").append(s25).append(" LEFT JOIN ").append(s26).append(" ON (").append(s27).append(".").append(s28).append("=").append(s29).append(".").append(s30).append(") GROUP BY ").append(s31).append(".").append(s32).append(", ").append(s33).append(".").append(s34).append(", ").append(s35).append(".").append(s36).append(", ").append(s37).append(".").append(s38).append(", ").append(s39).append(".").append(s40).append(", ").append(s41).append(".").append(s42).append(", ").append(s43).append(".").append(s44).append(", ").append(s45).append(".").append(s46).toString();
        obj = String.valueOf(h);
        s = String.valueOf("merged_contacts");
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        c = Uri.parse(((String) (obj)));
        obj = String.valueOf(h);
        s = String.valueOf("merged_contact_details");
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        d = Uri.parse(((String) (obj)));
        e = (new String[] {
            "_id", "contact_lookup_key", "contact_id", "raw_contact_id", "display_name", "avatar_url"
        });
        f = (new String[] {
            "_id", "contact_lookup_key", "contact_id", "raw_contact_id", "display_name", "avatar_url", "is_frequent", "is_favorite", "needs_gaia_ids_resolved", "is_hangouts_user", 
            "has_phone_number", "details"
        });
        g = (new String[] {
            "_id", "merged_contact_id", "lookup_data_type", "lookup_data", "lookup_data_standardized", "lookup_data_search", "lookup_data_label", "is_hangouts_user", "needs_gaia_ids_resolved", "gaia_id", 
            "avatar_url", "display_name", "last_checked_ts", "lookup_data_display"
        });
        return;
        obj;
        obj = "com.google.android.apps.hangouts.mergedcontacts.MergedContactProviderAltBuild";
          goto _L1
    }
}
