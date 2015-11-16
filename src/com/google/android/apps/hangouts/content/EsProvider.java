// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ani;
import apa;
import apc;
import apd;
import apt;
import apu;
import apv;
import aqc;
import cfa;
import dbf;
import dqb;
import ean;
import ebw;
import ecd;
import gbh;
import gz;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class EsProvider extends ContentProvider
{

    private static final Uri A;
    private static final Uri B;
    private static final UriMatcher C;
    private static final Map D;
    private static final Map E;
    private static final Map F;
    private static final Map G;
    private static final StringBuilder H;
    public static final String a;
    public static final String b;
    static final String c;
    public static final String d;
    public static final String e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    public static final Uri k;
    public static final Uri l;
    public static final Uri m;
    public static final Uri n;
    public static final Uri o;
    public static final Uri p;
    public static final Uri q;
    public static final Uri r;
    public static final Uri s;
    private static final boolean t;
    private static final String u;
    private static final String v;
    private static final String w;
    private static final String x;
    private static final String y;
    private static final Uri z;

    public EsProvider()
    {
    }

    public static int a(String s1, int i1)
    {
        if (s1 != null)
        {
            if (!TextUtils.isEmpty(s1 = b(s1, i1)))
            {
                try
                {
                    i1 = Integer.parseInt(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return 0;
                }
                return i1;
            }
        }
        return 0;
    }

    private static android.net.Uri.Builder a(android.net.Uri.Builder builder, int i1)
    {
        return builder.appendQueryParameter("account_id", Integer.toString(i1));
    }

    public static Uri a(int i1, int j1)
    {
        android.net.Uri.Builder builder = i.buildUpon();
        builder.appendQueryParameter("limit", String.valueOf(j1));
        a(builder, i1);
        return builder.build();
    }

    public static Uri a(int i1, long l1)
    {
        android.net.Uri.Builder builder = A.buildUpon();
        builder.appendPath(String.valueOf(l1));
        builder.appendQueryParameter("account_id", Integer.toString(i1));
        return builder.build();
    }

    public static Uri a(int i1, String s1)
    {
        gbh.b("Query should not be null", s1);
        if (TextUtils.isEmpty(s1))
        {
            ebw.f("Babel_db", "buildSuggestedPeopleQueryUri: query is empty");
            return null;
        } else
        {
            android.net.Uri.Builder builder = r.buildUpon();
            builder.appendPath(s1);
            a(builder, i1);
            return builder.build();
        }
    }

    public static Uri a(int i1, String s1, int j1)
    {
        gbh.b("Query should not be null", s1);
        if (TextUtils.isEmpty(s1))
        {
            ebw.f("Babel_db", "buildSuggestedPeopleQueryUri: query is empty");
            return null;
        } else
        {
            android.net.Uri.Builder builder = r.buildUpon();
            builder.appendPath(s1);
            builder.appendQueryParameter("limit", String.valueOf(j1));
            a(builder, i1);
            return builder.build();
        }
    }

    public static Uri a(Uri uri, int i1)
    {
        return a(uri.buildUpon(), i1).build();
    }

    public static Uri a(ani ani1)
    {
        android.net.Uri.Builder builder = B.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    public static Uri a(ani ani1, int i1)
    {
        android.net.Uri.Builder builder = n.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        if (i1 > 0)
        {
            builder.appendQueryParameter("limit", String.valueOf(i1));
        }
        return builder.build();
    }

    public static Uri a(ani ani1, String s1)
    {
        android.net.Uri.Builder builder = o.buildUpon();
        builder.appendPath(s1);
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    public static Uri a(ani ani1, ArrayList arraylist)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuilder.append(s1))
        {
            s1 = (String)arraylist.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("+");
            }
        }

        return d(ani1, stringbuilder.toString());
    }

    public static String a(int i1)
    {
        String s1 = String.valueOf("continuation_end_timestamp");
        return (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString();
    }

    private static String a(Context context, String s1)
    {
        context = String.valueOf(context.getCacheDir().getAbsolutePath());
        return (new StringBuilder(String.valueOf(context).length() + 18 + String.valueOf(s1).length())).append(context).append("/scratch/").append(s1).append(".temp.jpg").toString();
    }

    public static String a(String s1)
    {
        return (new StringBuilder(String.valueOf(s1).length() + 7)).append("quote(").append(s1).append(")").toString();
    }

    public static String a(String s1, String s2)
    {
        return (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length())).append("('|' || ").append(s1).append(" || '|') LIKE '%|").append(s2).append("|%'").toString();
    }

    public static void a(Context context)
    {
        int ai[] = dbf.e();
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            apa.a(context, ai[i1]).b().a(Locale.getDefault());
        }

    }

    private static void a(String s1, apv apv1)
    {
        if (s1 == null)
        {
            return;
        }
        StringBuilder stringbuilder = H;
        stringbuilder;
        JVM INSTR monitorenter ;
        int l1 = s1.length();
        int i1;
        boolean flag;
        int j1;
        j1 = -1;
        i1 = 0;
        flag = true;
_L4:
        int k1;
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        k1 = i1 + 1;
        char c1 = s1.charAt(i1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        j1++;
        H.setLength(0);
        if (c1 == '\'')
        {
            break; /* Loop/switch isn't completed */
        }
        H.append(c1);
_L2:
        if (k1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.charAt(k1) == '|')
        {
            break; /* Loop/switch isn't completed */
        }
        H.append(s1.charAt(k1));
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (TextUtils.equals(H, "NULL"))
        {
            H.setLength(0);
        }
        apv1.a(j1, H);
        if (k1 != l1)
        {
            i1 = k1 + 1;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_193;
        if (c1 != '\'')
        {
            break MISSING_BLOCK_LABEL_270;
        }
        if (k1 != l1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        apv1.a(j1, H);
        stringbuilder;
        JVM INSTR monitorexit ;
        return;
        s1;
        stringbuilder;
        JVM INSTR monitorexit ;
        throw s1;
        if (s1.charAt(k1) != '\'')
        {
            break MISSING_BLOCK_LABEL_229;
        }
        H.append(c1);
        i1 = k1 + 1;
        continue; /* Loop/switch isn't completed */
        gbh.a(Character.valueOf(s1.charAt(k1)), Character.valueOf('|'));
        apv1.a(j1, H);
        i1 = k1 + 1;
        flag = true;
        continue; /* Loop/switch isn't completed */
        H.append(c1);
        boolean flag1;
        i1 = j1;
        flag1 = flag;
        if (k1 != l1)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        if (t)
        {
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 75)).append("[EsProvider] splitQuotedString called with: ").append(s1).append(", which does not escape quotes.").toString());
        }
        apv1.a(j1, H);
        flag1 = flag;
        i1 = j1;
_L6:
        j1 = i1;
        flag = flag1;
        i1 = k1;
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = false;
        i1 = j1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static String[] a()
    {
        return (new String[] {
            "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_selector INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, snippet_sms_type TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, has_chat_notifications DEFAULT(0),has_video_notifications DEFAULT(0),last_hangout_event_time INT, draft TEXT, draft_subject TEXT, draft_attachment_url TEXT, draft_photo_rotation INT, draft_picasa_id TEXT, draft_content_type TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), chat_ringtone_uri TEXT, hangout_ringtone_uri TEXT, snippet_voicemail_duration INT DEFAULT (0), UNIQUE (conversation_id ));", "CREATE TABLE conversation_participants (_id INTEGER PRIMARY KEY, participant_row_id INT, participant_type INT, conversation_id TEXT, sequence INT, active INT, invitation_status INT DEFAULT(0), UNIQUE (conversation_id,participant_row_id) ON CONFLICT REPLACE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (participant_row_id) REFERENCES participants(_id));", b, "CREATE TABLE presence (_id INTEGER PRIMARY KEY, gaia_id TEXT NOT NULL, reachable INT DEFAULT(0), reachable_time INT DEFAULT(0), available INT DEFAULT(0), available_time INT DEFAULT(0), status_message TEXT, status_message_time INT DEFAULT(0), call_type INT DEFAULT(0), call_type_time INT DEFAULT(0), device_status INT DEFAULT(0), device_status_time INT DEFAULT(0), last_seen INT DEFAULT(0), last_seen_time INT DEFAULT(0), UNIQUE (gaia_id) ON CONFLICT REPLACE);", "CREATE TABLE suggested_contacts (_id INTEGER PRIMARY KEY, gaia_id TEXT, chat_id TEXT, name TEXT, first_name TEXT, packed_circle_ids TEXT, profile_photo_url TEXT, sequence INT, suggestion_type INT);", "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, delete_after_read_timetamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, address ADDRESS, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), transport_phone TEXT, external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, forwarded_mms_url TEXT, forwarded_mms_count INT DEFAULT(0), attachment_description TEXT, attachment_target_url_description TEXT, attachment_target_url_name TEXT, sending_error INT DEFAULT(0), stream_expiration INT, voicemail_length INT DEFAULT (0), call_media_type INT DEFAULT(0), last_seen_timestamp INT DEFAULT(0), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);", "CREATE TABLE event_suggestions (_id INTEGER PRIMARY KEY, conversation_id TEXT, event_id TEXT, suggestion_id TEXT, timestamp INT, expiration_time_usec INT, type INT, gem_asset_url STRING, gem_horizontal_alignment INT, matched_message_substring TEXT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE, UNIQUE (conversation_id,suggestion_id) ON CONFLICT REPLACE);", "CREATE TABLE multipart_attachments (_id INTEGER PRIMARY KEY, message_id TEXT, conversation_id TEXT, url TEXT, content_type TEXT, width INT, height INT, FOREIGN KEY (message_id, conversation_id) REFERENCES messages(message_id, conversation_id) ON DELETE CASCADE ON UPDATE CASCADE);", "CREATE TABLE blocked_people (_id INTEGER PRIMARY KEY, gaia_id TEXT, chat_id TEXT, name TEXT, profile_photo_url TEXT, UNIQUE (chat_id) ON CONFLICT REPLACE, UNIQUE (gaia_id) ON CONFLICT REPLACE);", "CREATE TABLE dismissed_contacts (_id INTEGER PRIMARY KEY, gaia_id TEXT, chat_id TEXT, name TEXT, profile_photo_url TEXT, UNIQUE (chat_id) ON CONFLICT REPLACE, UNIQUE (gaia_id) ON CONFLICT REPLACE);", 
            "CREATE TABLE search (search_key TEXT NOT NULL,continuation_token TEXT,PRIMARY KEY (search_key));", "CREATE TABLE mms_notification_inds (_id INTEGER PRIMARY KEY, content_location TEXT, transaction_id TEXT, from_address TEXT, message_size INT DEFAULT(0), expiry INT);", "CREATE TABLE merge_keys (_id INTEGER PRIMARY KEY, conversation_id TEXT, merge_key TEXT, UNIQUE (conversation_id) ON CONFLICT REPLACE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE  );", "CREATE TABLE recent_calls (_id INTEGER PRIMARY KEY, normalized_number TEXT NOT NULL, phone_number TEXT, contact_id TEXT, call_timestamp INT, call_type INT, contact_type INT, call_rate TEXT, is_free_call BOOLEAN);", "CREATE TABLE sticker_albums (album_id TEXT NOT NULL, title TEXT, cover_photo_id TEXT, last_used INT DEFAULT(0), PRIMARY KEY (album_id));", "CREATE TABLE sticker_photos (photo_id TEXT NOT NULL, album_id TEXT NOT NULL, url TEXT NOT NULL, file_name TEXT, last_used INT DEFAULT(0), PRIMARY KEY (photo_id), FOREIGN KEY (album_id) REFERENCES sticker_albums(album_id) ON DELETE CASCADE)"
        });
    }

    private static String[] a(SQLiteQueryBuilder sqlitequerybuilder, String as[], String s1, List list)
    {
        String as1[];
        if (list.size() == 1)
        {
            sqlitequerybuilder.appendWhere(s1);
            sqlitequerybuilder.appendWhere("=?");
            as1 = a(as, new String[] {
                (String)list.get(0)
            });
        } else
        {
            as1 = as;
            if (!list.isEmpty())
            {
                sqlitequerybuilder.appendWhere(s1);
                sqlitequerybuilder.appendWhere(" in (");
                for (s1 = list.iterator(); s1.hasNext();)
                {
                    as = a(as, new String[] {
                        (String)s1.next()
                    });
                    if (s1.hasNext())
                    {
                        sqlitequerybuilder.appendWhere("?,");
                    } else
                    {
                        sqlitequerybuilder.appendWhere("?");
                    }
                }

                sqlitequerybuilder.appendWhere(")");
                return as;
            }
        }
        return as1;
    }

    private static transient String[] a(String as[], String as1[])
    {
        if (as1.length == 0)
        {
            return as;
        }
        String as2[];
        int i1;
        int j1;
        if (as == null)
        {
            i1 = 0;
        } else
        {
            i1 = as.length;
        }
        j1 = as1.length;
        as2 = new String[i1 + j1];
        System.arraycopy(as1, 0, as2, 0, j1);
        if (i1 > 0)
        {
            System.arraycopy(as, 0, as2, j1, i1);
        }
        return as2;
    }

    public static Uri b(int i1)
    {
        android.net.Uri.Builder builder = s.buildUpon();
        builder.appendQueryParameter("account_id", (new StringBuilder(11)).append(i1).toString());
        return builder.build();
    }

    public static Uri b(int i1, String s1)
    {
        android.net.Uri.Builder builder = m.buildUpon();
        builder.appendPath(s1);
        return a(builder, i1).build();
    }

    public static Uri b(Uri uri, int i1)
    {
        return uri.buildUpon().appendQueryParameter("suggestion_type", Integer.toString(i1)).build();
    }

    public static Uri b(ani ani1)
    {
        android.net.Uri.Builder builder = k.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    public static Uri b(ani ani1, String s1)
    {
        android.net.Uri.Builder builder = p.buildUpon();
        builder.appendPath(s1);
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    public static String b(Context context)
    {
        return String.valueOf(context.getFilesDir().getAbsolutePath()).concat("/sticker_cache/");
    }

    public static String b(String s1)
    {
        return (new StringBuilder(String.valueOf(s1).length() + 20)).append("group_concat(").append(s1).append(", \"|\") ").toString();
    }

    public static String b(String s1, int i1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return "";
        }
        if (s1.charAt(0) == '\'' || s1.startsWith("NULL"))
        {
            return c(s1, i1);
        }
        s1 = s1.split("\\|");
        if (i1 >= s1.length)
        {
            return "";
        } else
        {
            return s1[i1];
        }
    }

    private static String b(String s1, String s2)
    {
        String s3 = String.valueOf("group_concat(CASE WHEN conversations.latest_message_expiration_timestamp < time_alias.current_timestamp THEN ");
        return (new StringBuilder(String.valueOf(s3).length() + 37 + String.valueOf(s2).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s1).length())).append(s3).append(s2).append(" WHEN ").append(s1).append(" IS NULL THEN ").append(s2).append(" ELSE ").append(s1).append(" END, \"|\") ").toString();
    }

    public static String[] b()
    {
        return (new String[] {
            "CREATE INDEX index_conversations_status ON conversations(status)", "CREATE INDEX index_merge_keys_merge_key_NEW ON merge_keys(merge_key)", "CREATE INDEX index_merge_keys_merge_conversation_id ON merge_keys(conversation_id); ", "CREATE INDEX index_conversation_participants_view_conversation_id ON conversation_participants(conversation_id)", "CREATE INDEX index_conversations_view ON conversations(view)", "CREATE INDEX index_conversations_sort_timestamp ON conversations(sort_timestamp)", "CREATE INDEX index_conversations_chat_notifications ON conversations(has_chat_notifications)", "CREATE INDEX index_conversations_video_notifications ON conversations(has_video_notifications)", "CREATE INDEX index_dismissed_contacts_gaia_id ON dismissed_contacts(gaia_id)", "CREATE INDEX index_participants_chat_id ON participants(chat_id)", 
            "CREATE INDEX index_participants_blocked ON participants(blocked)", "CREATE INDEX index_messages_conversation_id_alert_status ON messages(conversation_id, alert_status)", "CREATE INDEX index_messages_conversation_id_timestamp ON messages(conversation_id, timestamp)", "CREATE INDEX index_event_suggestions_conversation_id_expiration_time_timestamp  ON event_suggestions(conversation_id, expiration_time_usec, timestamp)", "CREATE INDEX index_multipart_attachments_conversation_id_message_id ON multipart_attachments(conversation_id, message_id)", "CREATE INDEX index_conversation_participants_sequence ON conversation_participants(sequence)", "CREATE INDEX index_recent_calls_sequence ON recent_calls(call_timestamp)"
        });
    }

    public static Uri c(ani ani1)
    {
        android.net.Uri.Builder builder = l.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    public static Uri c(ani ani1, String s1)
    {
        android.net.Uri.Builder builder = z.buildUpon();
        builder.appendPath(s1);
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    private ParcelFileDescriptor c(String s1, String s2)
    {
        String s3 = a(getContext(), s1);
        s1 = new File(s3);
        File file = s1.getParentFile();
        if (file.exists() || file.mkdirs())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s1 = String.valueOf(file.getPath());
        ebw.g("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 47)).append("[TempFileProvider] tempStoreFd: ").append(s1).append("does not exist!").toString());
        return null;
        int i1;
        if (s2.equals("r"))
        {
            i1 = 0x10000000;
        } else
        {
            i1 = 0x3c000000;
        }
        try
        {
            s1 = ParcelFileDescriptor.open(s1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            s1 = String.valueOf(s3);
            if (s1.length() != 0)
            {
                s1 = "getTempStoreFd: error creating pfd for ".concat(s1);
            } else
            {
                s1 = new String("getTempStoreFd: error creating pfd for ");
            }
            ebw.e("Babel_db", s1, s2);
            s1 = null;
        }
        return s1;
    }

    public static String c(Context context)
    {
        context = String.valueOf(b(context));
        if (context.length() != 0)
        {
            return "file://".concat(context);
        } else
        {
            return new String("file://");
        }
    }

    private static String c(String s1, int i1)
    {
        apu apu1 = new apu(i1);
        a(s1, apu1);
        return apu1.a;
    }

    public static List c(String s1)
    {
        ArrayList arraylist;
label0:
        {
            arraylist = new ArrayList();
            if (!TextUtils.isEmpty(s1))
            {
                if (s1.charAt(0) != '\'' && !s1.startsWith("NULL"))
                {
                    break label0;
                }
                a(s1, new apt(arraylist));
            }
            return arraylist;
        }
        Collections.addAll(arraylist, s1.split("\\|"));
        return arraylist;
    }

    public static String[] c()
    {
        return (new String[] {
            "conversation_participants_view", "participants_view", "conversations_view", "invites_view", "messages_view", "message_notifications_view", "conversation_images_view"
        });
    }

    public static Uri d(ani ani1, String s1)
    {
        android.net.Uri.Builder builder = B.buildUpon();
        builder.appendPath("conversation").appendPath(s1);
        builder.appendQueryParameter("account_id", Integer.toString(ani1.h()));
        return builder.build();
    }

    private static String d(String s1)
    {
        return b(s1, "\"\"");
    }

    public static String[] d()
    {
        return (new String[] {
            "CREATE VIEW conversation_participants_view AS SELECT participants._id as _id, conversation_participants.conversation_id as conversation_id, conversation_participants.sequence as sequence, conversation_participants.active as active, conversation_participants.invitation_status as invitation_status, participants.circle_id as circle_id, participants.gaia_id as gaia_id, participants.chat_id as chat_id, participants.phone_id as phone_id, participants.fallback_name as fallback_name,  IFNULL(participants.full_name, participants.fallback_name)  as full_name,  IFNULL(IFNULL(participants.first_name, participants.full_name), participants.fallback_name)  as first_name, participants.profile_photo_url as profile_photo_url, participants.batch_gebi_tag as batch_gebi_tag, participants.participant_type as participant_type, participants.blocked as blocked, participants.in_users_domain as in_users_domain  FROM conversation_participants LEFT JOIN participants ON (conversation_participants.participant_row_id=participants._id)", "CREATE VIEW participants_view AS SELECT participants._id, participants.circle_id, participants.gaia_id, participants.chat_id, participants.phone_id,  IFNULL(participants.full_name, participants.fallback_name)  as full_name,  IFNULL(participants.first_name, participants.fallback_name)  as first_name, participants.fallback_name, participants.profile_photo_url, participants.batch_gebi_tag, participants.participant_type, participants.blocked  FROM participants", c, d, "CREATE VIEW messages_view AS SELECT messages._id as _id, messages.message_id as message_id, messages.conversation_id as conversation_id, messages.author_chat_id as author_chat_id, messages.author_gaia_id as author_gaia_id, messages.text as text, messages.timestamp as timestamp, messages.status as status, messages.type as type, messages.local_url as local_url, messages.remote_url as remote_url, messages.attachment_content_type as attachment_content_type, messages.width_pixels as width_pixels, messages.height_pixels as height_pixels, messages.stream_id as stream_id, messages.image_id as image_id, messages.album_id as album_id,messages.attachment_name as attachment_name, messages.attachment_description as attachment_description, messages.latitude as latitude, messages.longitude as longitude,messages.address as address,messages.attachment_target_url as attachment_target_url,messages.attachment_target_url_name as attachment_target_url_name,messages.attachment_target_url_description as attachment_target_url_description,messages.expiration_timestamp as expiration_timestamp, messages.alert_status as alert_status, messages.off_the_record as off_the_record, messages.external_ids as external_ids, messages.sms_message_size as sms_message_size, messages.sms_priority as sms_priority, messages.sms_timestamp_sent as sms_timestamp_sent, messages.mms_subject as mms_subject, messages.sms_raw_sender as sms_raw_sender, messages.sms_raw_recipients as sms_raw_recipients, messages.persisted as persisted, messages.transport_type as transport_type, messages.transport_phone as transport_phone, messages.sms_message_status as sms_message_status, messages.sms_type as sms_type, messages.stream_url as stream_url, messages.stream_expiration as stream_expiration, messages.voicemail_length as voicemail_length, messages.image_rotation as image_rotation, messages.new_conversation_name as new_conversation_name, messages.participant_keys as participant_keys, messages.forwarded_mms_url as forwarded_mms_url, messages.forwarded_mms_count as forwarded_mms_count, messages.sending_error as sending_error, messages.call_media_type as call_media_type, messages.last_seen_timestamp as last_seen_timestamp FROM messages WHERE expiration_timestamp IS NULL OR expiration_timestamp >= (julianday('now') - 2440587.5) * 86400000000", "CREATE VIEW message_notifications_view AS SELECT messages._id as _id, messages.message_id as message_id, messages.conversation_id as conversation_id, messages.author_chat_id as author_chat_id, messages.author_gaia_id as author_gaia_id, messages.text as text, messages.local_url as local_url, messages.remote_url as remote_url, messages.attachment_content_type as attachment_content_type, messages.width_pixels as width_pixels, messages.height_pixels as height_pixels, messages.stream_id as stream_id, messages.image_id as image_id, messages.album_id as album_id, messages.attachment_name as attachment_name, messages.latitude as latitude, messages.longitude as longitude,messages.address as address,messages.attachment_target_url as attachment_target_url,messages.timestamp as timestamp, messages.status as status, messages.type as type, messages.transport_type as transport_type, messages.transport_phone as transport_phone, messages.notification_level as notification_level, messages.notified_for_failure as notified_for_failure, messages.new_conversation_name as new_conversation_name, messages.participant_keys as participant_keys, messages.sms_type as sms_type, messages.last_seen_timestamp as last_seen_timestamp, (select merge_key from merge_keys where merge_keys.conversation_id=messages.conversation_id)  as merge_key, author_alias.full_name as author_full_name, author_alias.first_name as author_first_name, author_alias.profile_photo_url as author_profile_photo_url, conversations.notification_level as conversation_notification_level, conversations.status as conversation_status, conversations.view as conversation_view, conversations.is_pending_leave as conversation_pending_leave, conversations.has_chat_notifications as conversation_has_chat_notifications, conversations.has_video_notifications as conversation_has_video_notifications, conversations.name as conversation_name, conversations.generated_name as generated_name, conversations.conversation_type as conversation_type, conversations.chat_watermark as chat_watermark, conversations.hangout_watermark as hangout_watermark, conversations.self_watermark as self_watermark ,conversations.chat_ringtone_uri as chat_ringtone_uri, conversations.hangout_ringtone_uri as hangout_ringtone_uri, conversations.otr_status as otr_status, conversations.call_media_type as call_media_type FROM messages LEFT JOIN conversation_participants_view author_alias ON ((messages.author_chat_id=author_alias.chat_id OR author_chat_id=author_alias.gaia_id) AND messages.conversation_id=author_alias.conversation_id) LEFT JOIN conversations ON messages.conversation_id=conversations.conversation_id", "CREATE VIEW conversation_images_view AS SELECT  CASE WHEN multipart_attachments.url NOT NULL THEN multipart_attachments.url WHEN messages.remote_url NOT NULL THEN messages.remote_url ELSE messages.local_url END  as uri, messages.text as _display_name,  CASE WHEN multipart_attachments.url NOT NULL THEN multipart_attachments.url WHEN messages.remote_url NOT NULL THEN messages.remote_url ELSE messages.local_url END  as contentUri,  CASE WHEN messages.remote_url NOT NULL THEN messages.remote_url ELSE messages.local_url END  as thumbnailUri, 'image/jpeg' as contentType, messages.attachment_content_type as realContentType, messages.conversation_id as conversation_id, messages.timestamp as date, conversation_participants_view.full_name as author, conversation_participants_view.profile_photo_url as iconUri, messages.attachment_target_url as sourceUrl, messages.attachment_target_url_name as sourceName, messages.attachment_target_url_description as sourceDescription, messages.attachment_description as hashtag  FROM messages LEFT JOIN conversation_participants_view ON ((messages.author_chat_id=conversation_participants_view.chat_id OR messages.author_gaia_id=conversation_participants_view.gaia_id) AND messages.conversation_id=conversation_participants_view.conversation_id) LEFT OUTER JOIN multipart_attachments USING (conversation_id, message_id)  WHERE (expiration_timestamp IS NULL OR expiration_timestamp >= (julianday('now') - 2440587.5) * 86400000000) AND (remote_url NOT NULL OR local_url NOT NULL OR multipart_attachments.url NOT NULL) AND (attachment_content_type LIKE 'image/%' OR attachment_content_type='multipart/mixed') AND (local_url IS NULL OR (local_url NOT LIKE '%/sticker_cache/%' AND local_url NOT LIKE 'sticker://%'))"
        });
    }

    private static String e(String s1)
    {
        return String.format(Locale.US, "max(%s)", new Object[] {
            s1
        });
    }

    public static String[] e()
    {
        return (new String[] {
            y, e
        });
    }

    public int delete(Uri uri, String s1, String as[])
    {
        if (t)
        {
            s1 = String.valueOf(uri);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 7)).append("delete ").append(s1).toString());
        }
        switch (C.match(uri))
        {
        default:
            throw new IllegalArgumentException();

        case 140: 
            s1 = (String)uri.getPathSegments().get(1);
            break;
        }
        uri = a(getContext(), s1);
        if ((new File(uri)).delete())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        uri = String.valueOf(s1);
        if (uri.length() == 0)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        uri = "delete: error deleting ".concat(uri);
_L1:
        ebw.f("Babel_db", uri);
        return 0;
        try
        {
            uri = new String("delete: error deleting ");
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            uri = String.valueOf(s1);
            if (uri.length() != 0)
            {
                uri = "delete: error deleting ".concat(uri);
            } else
            {
                uri = new String("delete: error deleting ");
            }
            ebw.e("Babel_db", uri, as);
            return 0;
        }
          goto _L1
        return 1;
    }

    public String getType(Uri uri)
    {
        switch (C.match(uri))
        {
        default:
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 13)).append("Unknown URI: ").append(uri).toString());

        case 100: // 'd'
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.conversations";

        case 110: // 'n'
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.participants";

        case 190: 
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.blocked_people";

        case 230: 
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.dismissed_contacts";

        case 120: // 'x'
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.messages";

        case 160: 
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.message_notifications";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        uri = String.valueOf(uri);
        throw new IllegalStateException((new StringBuilder(String.valueOf(uri).length() + 21)).append("Insert not supported ").append(uri).toString());
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s2 = String.valueOf(uri);
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 9)).append("openFile ").append(s2).toString());
        }
        switch (C.match(uri))
        {
        default:
            return null;

        case 140: 
            return c((String)uri.getPathSegments().get(1), s1);
        }
    }

    public Cursor query(Uri uri, String as[], String s1, String as1[], String s2)
    {
        String s3;
        String s4;
        SQLiteQueryBuilder sqlitequerybuilder;
        Object obj1;
        s3 = uri.getQueryParameter("account_id");
        if (s3 == null)
        {
            as = String.valueOf("Every URI must have the 'account_id' parameter specified.\nURI: ");
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(as).length() + 0 + String.valueOf(uri).length())).append(as).append(uri).toString());
        }
        s4 = uri.getQueryParameter("limit");
        obj1 = uri.getQueryParameters("suggestion_type");
        sqlitequerybuilder = new SQLiteQueryBuilder();
        C.match(uri);
        JVM INSTR lookupswitch 17: default 248
    //                   100: 849
    //                   101: 886
    //                   102: 868
    //                   110: 1022
    //                   120: 1234
    //                   121: 1431
    //                   130: 1574
    //                   140: 1705
    //                   160: 1215
    //                   180: 806
    //                   181: 291
    //                   190: 1161
    //                   200: 1341
    //                   210: 1659
    //                   220: 905
    //                   230: 1188
    //                   240: 1686;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        uri = String.valueOf(uri);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 12)).append("Unknown URI ").append(uri).toString());
_L12:
        Object obj;
        obj = uri.getPathSegments();
        int i1;
        if (((List) (obj)).size() <= 2)
        {
            obj = "";
        } else
        {
            obj = ((String)((List) (obj)).get(2)).trim();
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ebw.f("Babel_db", "prepareSuggestedPeopleSearchQuery: query is empty");
        } else
        {
            sqlitequerybuilder.setTables("suggested_contacts");
            sqlitequerybuilder.appendWhere("(");
            String s6 = DatabaseUtils.sqlEscapeString(String.valueOf(obj).concat("%"));
            String s5 = DatabaseUtils.sqlEscapeString((new StringBuilder(String.valueOf(obj).length() + 3)).append("% ").append(((String) (obj))).append("%").toString());
            obj = String.valueOf("name LIKE ");
            s6 = String.valueOf(s6);
            if (s6.length() != 0)
            {
                obj = ((String) (obj)).concat(s6);
            } else
            {
                obj = new String(((String) (obj)));
            }
            sqlitequerybuilder.appendWhere(((CharSequence) (obj)));
            sqlitequerybuilder.appendWhere(" OR ");
            obj = String.valueOf("name LIKE ");
            s5 = String.valueOf(s5);
            if (s5.length() != 0)
            {
                obj = ((String) (obj)).concat(s5);
            } else
            {
                obj = new String(((String) (obj)));
            }
            sqlitequerybuilder.appendWhere(((CharSequence) (obj)));
            sqlitequerybuilder.appendWhere(")");
        }
        obj = as1;
        if (!((List) (obj1)).isEmpty())
        {
            sqlitequerybuilder.appendWhere(" AND ");
            obj = a(sqlitequerybuilder, as1, "suggestion_type", ((List) (obj1)));
        }
        as1 = "UPPER(name)";
_L19:
        if (!TextUtils.isEmpty(s2))
        {
            as1 = s2;
        }
        ecd.a("EsProvider query");
        if (t)
        {
            obj1 = String.valueOf(uri);
            i1 = C.match(uri);
            s2 = String.valueOf(sqlitequerybuilder.buildQuery(as, s1, null, null, s2, s4));
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(obj1).length() + 46 + String.valueOf(s2).length())).append("[EsProvider] URI:").append(((String) (obj1))).append(", match: ").append(i1).append(", QUERY: ").append(s2).toString());
        }
        int j1;
        boolean flag;
        int k1;
        try
        {
            as = apa.a(getContext(), Integer.parseInt(s3)).a().a(sqlitequerybuilder, as, s1, ((String []) (obj)), as1, s4);
            if (t)
            {
                i1 = as.getCount();
                ebw.c("Babel_db", (new StringBuilder(39)).append("[EsProvider] QUERY results: ").append(i1).toString());
            }
            as.setNotificationUri(getContext().getContentResolver(), uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            ecd.a();
            return null;
        }
        ecd.a();
        return as;
_L11:
        sqlitequerybuilder.setTables("suggested_contacts");
        obj = as1;
        if (!((List) (obj1)).isEmpty())
        {
            obj = a(sqlitequerybuilder, as1, "suggestion_type", ((List) (obj1)));
        }
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L2:
        sqlitequerybuilder.setTables("conversations_view");
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L4:
        sqlitequerybuilder.setTables("conversations");
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L3:
        sqlitequerybuilder.setTables("invites_view");
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L16:
        sqlitequerybuilder.setTables("conversation_participants_view JOIN conversations ON (conversation_participants_view.conversation_id=conversations.conversation_id)");
        sqlitequerybuilder.appendWhere("conversation_type");
        sqlitequerybuilder.appendWhere("=1");
        sqlitequerybuilder.appendWhere(" AND ");
        sqlitequerybuilder.appendWhere("participant_type");
        j1 = cfa.d.ordinal();
        sqlitequerybuilder.appendWhere((new StringBuilder(12)).append("=").append(j1).toString());
        sqlitequerybuilder.appendWhere(" AND ");
        sqlitequerybuilder.appendWhere("latest_message_timestamp");
        sqlitequerybuilder.appendWhere("!= 0");
        sqlitequerybuilder.setProjectionMap(F);
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L5:
        sqlitequerybuilder.setTables("conversation_participants_view");
        sqlitequerybuilder.appendWhere("conversation_id");
        sqlitequerybuilder.appendWhere(" in (");
        obj = TextUtils.split((String)uri.getPathSegments().get(2), "\\+");
        k1 = obj.length;
        flag = true;
        j1 = 0;
        while (j1 < k1) 
        {
            obj1 = obj[j1];
            if (flag)
            {
                flag = false;
            } else
            {
                sqlitequerybuilder.appendWhere(",");
            }
            sqlitequerybuilder.appendWhere("'");
            sqlitequerybuilder.appendWhere(((CharSequence) (obj1)));
            sqlitequerybuilder.appendWhere("'");
            j1++;
        }
        sqlitequerybuilder.appendWhere(")");
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L13:
        sqlitequerybuilder.setTables("blocked_people");
        sqlitequerybuilder.setProjectionMap(D);
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L17:
        sqlitequerybuilder.setTables("dismissed_contacts");
        sqlitequerybuilder.setProjectionMap(E);
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L10:
        sqlitequerybuilder.setTables("message_notifications_view");
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L6:
        sqlitequerybuilder.setTables("messages_view");
        sqlitequerybuilder.appendWhere("status");
        j1 = dqb.f.ordinal();
        sqlitequerybuilder.appendWhere((new StringBuilder(20)).append(" != ").append(j1).append(" AND ").toString());
        sqlitequerybuilder.appendWhere("conversation_id");
        sqlitequerybuilder.appendWhere("=?");
        obj = a(as1, new String[] {
            (String)uri.getPathSegments().get(2)
        });
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L14:
        sqlitequerybuilder.setTables("event_suggestions");
        sqlitequerybuilder.appendWhere("conversation_id");
        sqlitequerybuilder.appendWhere("=? AND (");
        sqlitequerybuilder.appendWhere("expiration_time_usec");
        sqlitequerybuilder.appendWhere("<= 0 OR ");
        sqlitequerybuilder.appendWhere("expiration_time_usec");
        sqlitequerybuilder.appendWhere("> (julianday('now') - 2440587.5) * 86400000000)");
        obj = a(as1, new String[] {
            (String)uri.getPathSegments().get(2)
        });
        as1 = "";
        continue; /* Loop/switch isn't completed */
_L7:
        sqlitequerybuilder.setTables("messages_view");
        obj = String.valueOf("status != ");
        j1 = dqb.f.ordinal();
        obj1 = String.valueOf("conversation_id");
        sqlitequerybuilder.appendWhere((new StringBuilder(String.valueOf(obj).length() + 228 + String.valueOf(obj1).length())).append(((String) (obj))).append(j1).append(" AND ").append(((String) (obj1))).append(" IN (SELECT conversation_id FROM conversations WHERE conversation_id=? OR conversation_id IN").append(" (SELECT conversation_id FROM merge_keys WHERE merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)))").toString());
        obj = (String)uri.getPathSegments().get(2);
        obj = a(as1, new String[] {
            obj, obj
        });
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L8:
        sqlitequerybuilder.setTables("conversation_images_view");
        sqlitequerybuilder.appendWhere("conversation_id IN (SELECT conversation_id FROM merge_keys WHERE merge_key=(SELECT merge_key FROM merge_keys WHERE conversation_id=?))");
        if (!ean.a(getContext()))
        {
            sqlitequerybuilder.appendWhere(" AND ");
            sqlitequerybuilder.appendWhere("realContentType");
            sqlitequerybuilder.appendWhere(" != 'image/gif'");
        }
        obj = a(as1, new String[] {
            (String)uri.getPathSegments().get(2)
        });
        as1 = "date ASC";
        continue; /* Loop/switch isn't completed */
_L15:
        sqlitequerybuilder.setTables("recent_calls");
        sqlitequerybuilder.setProjectionMap(G);
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L18:
        sqlitequerybuilder.setTables("presence");
        obj = as1;
        as1 = s2;
        if (true) goto _L19; else goto _L9
_L9:
        return null;
        uri;
        ecd.a();
        throw uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s1, String as[])
    {
        uri = String.valueOf(uri);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 22)).append("Update not supported: ").append(uri).toString());
    }

    static 
    {
        hik hik = ebw.d;
        t = false;
        Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        Object obj = "com.google.android.apps.hangouts.content.EsProvider";
_L1:
        a = ((String) (obj));
        u = (new StringBuilder(String.valueOf(obj).length() + 11)).append("content://").append(((String) (obj))).append("/").toString();
        obj = String.valueOf("CREATE TABLE participants (_id INTEGER PRIMARY KEY, participant_type INT DEFAULT ");
        int i1 = cfa.b.ordinal();
        Object obj1 = String.valueOf("gaia_id");
        String s1 = String.valueOf("chat_id");
        String s2 = String.valueOf("phone_id");
        String s3 = String.valueOf("circle_id");
        String s4 = String.valueOf("first_name");
        String s5 = String.valueOf("full_name");
        String s6 = String.valueOf("fallback_name");
        String s7 = String.valueOf("profile_photo_url");
        String s8 = String.valueOf("batch_gebi_tag");
        String s9 = String.valueOf("blocked");
        String s10 = String.valueOf("in_users_domain");
        String s11 = String.valueOf("circle_id");
        String s12 = String.valueOf("chat_id");
        String s13 = String.valueOf("gaia_id");
        b = (new StringBuilder(String.valueOf(obj).length() + 212 + String.valueOf(obj1).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length())).append(((String) (obj))).append(i1).append(", ").append(((String) (obj1))).append(" TEXT, ").append(s1).append(" TEXT, ").append(s2).append(" TEXT, ").append(s3).append(" TEXT, ").append(s4).append(" TEXT, ").append(s5).append(" TEXT, ").append(s6).append(" TEXT, ").append(s7).append(" TEXT, ").append(s8).append(" STRING DEFAULT('-1'), ").append(s9).append(" INT DEFAULT(0), ").append(s10).append(" BOOLEAN, UNIQUE (").append(s11).append(") ON CONFLICT REPLACE, UNIQUE (").append(s12).append(") ON CONFLICT REPLACE, UNIQUE (").append(s13).append(") ON CONFLICT REPLACE);").toString();
        obj = String.valueOf(" SELECT conversations._id as _id, ");
        obj1 = b("conversations.conversation_id");
        s1 = String.valueOf(" as ");
        s2 = String.valueOf("conversation_id");
        s3 = String.valueOf("conversations");
        s4 = String.valueOf("notification_level");
        s5 = String.valueOf(" as ");
        s6 = String.valueOf("notification_level");
        s7 = String.valueOf("latest_message_timestamp");
        s8 = String.valueOf(" as ");
        s9 = String.valueOf("latest_message_timestamp");
        s10 = String.valueOf("conversations");
        s11 = String.valueOf("latest_message_expiration_timestamp");
        s12 = String.valueOf(" as ");
        s13 = String.valueOf("latest_message_expiration_timestamp");
        String s14 = String.valueOf("conversations");
        String s15 = String.valueOf("metadata_present");
        String s16 = String.valueOf(" as ");
        String s17 = String.valueOf("metadata_present");
        String s18 = String.valueOf("conversations");
        String s19 = String.valueOf("name");
        String s20 = String.valueOf(" as ");
        String s21 = String.valueOf("name");
        String s22 = b(a("conversations.generated_name"));
        String s23 = String.valueOf(" as ");
        String s24 = String.valueOf("generated_name");
        String s25 = String.valueOf("conversations");
        String s26 = String.valueOf("conversation_type");
        String s27 = String.valueOf(" as ");
        String s28 = String.valueOf("conversation_type");
        String s29 = b("conversations.transport_type");
        String s30 = String.valueOf(" as ");
        String s31 = String.valueOf("transport_type");
        String s32 = String.valueOf("conversations");
        String s33 = String.valueOf("default_transport_phone");
        String s34 = String.valueOf(" as ");
        String s35 = String.valueOf("default_transport_phone");
        String s36 = String.valueOf("conversations");
        String s37 = String.valueOf("sms_service_center");
        String s38 = String.valueOf(" as ");
        String s39 = String.valueOf("sms_service_center");
        String s40 = String.valueOf("conversations");
        String s41 = String.valueOf("sms_thread_id");
        String s42 = String.valueOf(" as ");
        String s43 = String.valueOf("sms_thread_id");
        String s44 = String.valueOf("merge_keys");
        String s45 = String.valueOf("merge_keys");
        String s46 = String.valueOf("conversation_id");
        String s47 = String.valueOf("conversations");
        String s48 = String.valueOf("conversation_id");
        String s49 = String.valueOf(" as ");
        String s50 = String.valueOf("merge_key");
        String s51 = b("conversations.snippet_type", "7");
        String s52 = String.valueOf(" as ");
        String s53 = String.valueOf("snippet_type");
        String s54 = d(a("conversations.snippet_text"));
        String s55 = String.valueOf(" as ");
        String s56 = String.valueOf("snippet_text");
        String s57 = d(a("conversations.snippet_voicemail_duration"));
        String s58 = String.valueOf(" as ");
        String s59 = String.valueOf("snippet_voicemail_duration");
        String s60 = d(a("conversations.snippet_image_url"));
        String s61 = String.valueOf(" as ");
        String s62 = String.valueOf("snippet_image_url");
        String s63 = d("conversations.snippet_author_gaia_id");
        String s64 = String.valueOf(" as ");
        String s65 = String.valueOf("snippet_author_gaia_id");
        String s66 = d("conversations.snippet_author_chat_id");
        String s67 = String.valueOf(" as ");
        String s68 = String.valueOf("snippet_author_chat_id");
        String s69 = d("conversations.snippet_status");
        String s70 = String.valueOf(" as ");
        String s71 = String.valueOf("snippet_status");
        String s72 = d(a("IFNULL(author_alias.full_name, author_alias.fallback_name)"));
        String s73 = String.valueOf(" as ");
        String s74 = String.valueOf("latest_message_author_full_name");
        String s75 = d(a("IFNULL(IFNULL(author_alias.first_name, author_alias.full_name), author_alias.fallback_name)"));
        String s76 = String.valueOf(" as ");
        String s77 = String.valueOf("latest_message_author_first_name");
        String s78 = d(a("author_alias.profile_photo_url"));
        String s79 = String.valueOf(" as ");
        String s80 = String.valueOf("latest_message_author_profile_photo_url");
        String s81 = d("conversations.latest_message_timestamp");
        String s82 = String.valueOf(" as ");
        String s83 = String.valueOf("snippet_selector");
        String s84 = d("conversations.snippet_participant_keys");
        String s85 = String.valueOf(" as ");
        String s86 = String.valueOf("snippet_participant_keys");
        String s87 = d("conversations.snippet_sms_type");
        String s88 = String.valueOf(" as ");
        String s89 = String.valueOf("snippet_sms_type");
        String s90 = d("conversations.latest_message_expiration_timestamp");
        String s91 = String.valueOf(" as ");
        String s92 = String.valueOf("latest_message_expiration_timestamp");
        String s93 = d("conversations.previous_latest_timestamp");
        String s94 = String.valueOf(" as ");
        String s95 = String.valueOf("previous_latest_timestamp");
        String s96 = d(a("conversations.snippet_new_conversation_name"));
        String s97 = String.valueOf(" as ");
        String s98 = String.valueOf("snippet_new_conversation_name");
        String s99 = String.valueOf("conversations");
        String s100 = String.valueOf("status");
        String s101 = String.valueOf(" as ");
        String s102 = String.valueOf("status");
        String s103 = String.valueOf("conversations");
        String s104 = String.valueOf("view");
        String s105 = String.valueOf(" as ");
        String s106 = String.valueOf("view");
        String s107 = String.valueOf("conversations");
        String s108 = String.valueOf("inviter_gaia_id");
        String s109 = String.valueOf(" as ");
        String s110 = String.valueOf("inviter_gaia_id");
        String s111 = String.valueOf("conversations");
        String s112 = String.valueOf("inviter_chat_id");
        String s113 = String.valueOf(" as ");
        String s114 = String.valueOf("inviter_chat_id");
        String s115 = String.valueOf("conversations");
        String s116 = String.valueOf("inviter_affinity");
        String s117 = String.valueOf(" as ");
        String s118 = String.valueOf("inviter_affinity");
        String s119 = String.valueOf("conversations");
        String s120 = String.valueOf("disposition");
        String s121 = String.valueOf(" as ");
        String s122 = String.valueOf("disposition");
        String s123 = String.valueOf("conversations");
        String s124 = String.valueOf("is_pending_leave");
        String s125 = String.valueOf(" as ");
        String s126 = String.valueOf("is_pending_leave");
        String s127 = b(a("conversations.packed_avatar_urls"));
        String s128 = String.valueOf(" as ");
        String s129 = String.valueOf("packed_avatar_urls");
        String s130 = String.valueOf("conversations");
        String s131 = String.valueOf("self_avatar_url");
        String s132 = String.valueOf(" as ");
        String s133 = String.valueOf("self_avatar_url");
        String s134 = String.valueOf("conversations");
        String s135 = String.valueOf("self_watermark");
        String s136 = String.valueOf(" as ");
        String s137 = String.valueOf("self_watermark");
        String s138 = String.valueOf("conversations");
        String s139 = String.valueOf("chat_watermark");
        String s140 = String.valueOf(" as ");
        String s141 = String.valueOf("chat_watermark");
        String s142 = String.valueOf("conversations");
        String s143 = String.valueOf("hangout_watermark");
        String s144 = String.valueOf(" as ");
        String s145 = String.valueOf("hangout_watermark");
        String s146 = String.valueOf("conversations");
        String s147 = String.valueOf("is_draft");
        String s148 = String.valueOf(" as ");
        String s149 = String.valueOf("is_draft");
        String s150 = String.valueOf("conversations");
        String s151 = String.valueOf("sequence_number");
        String s152 = String.valueOf(" as ");
        String s153 = String.valueOf("sequence_number");
        String s154 = e("conversations.call_media_type");
        String s155 = String.valueOf(" as ");
        String s156 = String.valueOf("call_media_type");
        String s157 = String.valueOf("conversations");
        String s158 = String.valueOf("has_joined_hangout");
        String s159 = String.valueOf(" as ");
        String s160 = String.valueOf("has_joined_hangout");
        String s161 = String.valueOf("conversations");
        String s162 = String.valueOf("last_hangout_event_time");
        String s163 = String.valueOf(" as ");
        String s164 = String.valueOf("last_hangout_event_time");
        String s165 = String.valueOf("conversations");
        String s166 = String.valueOf("draft");
        String s167 = String.valueOf(" as ");
        String s168 = String.valueOf("draft");
        String s169 = String.valueOf("conversations");
        String s170 = String.valueOf("draft_subject");
        String s171 = String.valueOf(" as ");
        String s172 = String.valueOf("draft_subject");
        String s173 = String.valueOf("conversations");
        String s174 = String.valueOf("draft_attachment_url");
        String s175 = String.valueOf(" as ");
        String s176 = String.valueOf("draft_attachment_url");
        String s177 = String.valueOf("conversations");
        String s178 = String.valueOf("draft_photo_rotation");
        String s179 = String.valueOf(" as ");
        String s180 = String.valueOf("draft_photo_rotation");
        String s181 = String.valueOf("conversations");
        String s182 = String.valueOf("draft_picasa_id");
        String s183 = String.valueOf(" as ");
        String s184 = String.valueOf("draft_picasa_id");
        String s185 = String.valueOf("conversations");
        String s186 = String.valueOf("draft_content_type");
        String s187 = String.valueOf(" as ");
        String s188 = String.valueOf("draft_content_type");
        String s189 = String.valueOf("conversations");
        String s190 = String.valueOf("otr_status");
        String s191 = String.valueOf(" as ");
        String s192 = String.valueOf("otr_status");
        String s193 = String.valueOf("conversations");
        String s194 = String.valueOf("otr_toggle");
        String s195 = String.valueOf(" as ");
        String s196 = String.valueOf("otr_toggle");
        String s197 = String.valueOf("conversations");
        String s198 = String.valueOf("last_otr_modification_time");
        String s199 = String.valueOf(" as ");
        String s200 = String.valueOf("last_otr_modification_time");
        String s201 = String.valueOf("conversations");
        String s202 = String.valueOf("continuation_token");
        String s203 = String.valueOf(" as ");
        String s204 = String.valueOf("continuation_token");
        String s205 = String.valueOf("conversations");
        String s206 = String.valueOf("continuation_event_timestamp");
        String s207 = String.valueOf(" as ");
        String s208 = String.valueOf("continuation_event_timestamp");
        String s209 = String.valueOf("conversations");
        String s210 = String.valueOf("has_oldest_message");
        String s211 = String.valueOf(" as ");
        String s212 = String.valueOf("has_oldest_message");
        String s213 = String.valueOf("conversations");
        String s214 = String.valueOf("chat_ringtone_uri");
        String s215 = String.valueOf(" as ");
        String s216 = String.valueOf("chat_ringtone_uri");
        String s217 = String.valueOf("conversations");
        String s218 = String.valueOf("hangout_ringtone_uri");
        String s219 = String.valueOf(" as ");
        String s220 = String.valueOf("hangout_ringtone_uri");
        String s221 = String.valueOf("messages");
        String s222 = String.valueOf("alert_status");
        String s223 = String.valueOf("messages");
        String s224 = String.valueOf("alert_status");
        String s225 = String.valueOf(" as ");
        String s226 = String.valueOf("failed_message_count");
        String s227 = String.valueOf(" as ");
        String s228 = String.valueOf("sort_timestamp");
        String s229 = String.valueOf(" as ");
        String s230 = String.valueOf("blocked");
        String s231 = String.valueOf("inviter_alias");
        String s232 = String.valueOf("full_name");
        String s233 = String.valueOf("inviter_alias");
        String s234 = String.valueOf("fallback_name");
        String s235 = String.valueOf(" as ");
        String s236 = String.valueOf("inviter_full_name");
        String s237 = String.valueOf("inviter_alias");
        String s238 = String.valueOf("first_name");
        String s239 = String.valueOf("inviter_alias");
        String s240 = String.valueOf("fallback_name");
        String s241 = String.valueOf(" as ");
        String s242 = String.valueOf("inviter_first_name");
        String s243 = String.valueOf("inviter_alias");
        String s244 = String.valueOf("profile_photo_url");
        String s245 = String.valueOf(" as ");
        String s246 = String.valueOf("inviter_profile_photo_url");
        String s247 = String.valueOf("inviter_alias");
        String s248 = String.valueOf("participant_type");
        String s249 = String.valueOf(" as ");
        String s250 = String.valueOf("inviter_type");
        String s251 = b("conversations.self_watermark < conversations.latest_message_timestamp");
        String s252 = String.valueOf(" as ");
        String s253 = String.valueOf("has_unread");
        String s254 = d(a("IFNULL(inviter_alias.full_name, inviter_alias.fallback_name) "));
        String s255 = String.valueOf(" as ");
        String s256 = String.valueOf("inviter_full_name");
        String s257 = d(a("IFNULL(inviter_alias.first_name, inviter_alias.fallback_name) "));
        String s258 = String.valueOf(" as ");
        String s259 = String.valueOf("inviter_first_name");
        String s260 = d(a("inviter_alias.profile_photo_url"));
        String s261 = String.valueOf(" as ");
        String s262 = String.valueOf("inviter_profile_photo_url");
        String s263 = d(a("inviter_alias.participant_type"));
        String s264 = String.valueOf(" as ");
        String s265 = String.valueOf("inviter_type");
        String s266 = String.valueOf("row_count");
        String s267 = String.valueOf("inviter_aggregate");
        String s268 = String.valueOf("invite_time_aggregate");
        String s269 = String.valueOf("participants");
        String s270 = String.valueOf("author_alias");
        String s271 = String.valueOf("conversations");
        String s272 = String.valueOf("snippet_author_chat_id");
        String s273 = String.valueOf("author_alias");
        String s274 = String.valueOf("chat_id");
        String s275 = String.valueOf("conversations");
        String s276 = String.valueOf("snippet_author_chat_id");
        String s277 = String.valueOf("author_alias");
        String s278 = String.valueOf("gaia_id");
        String s279 = String.valueOf("participants");
        String s280 = String.valueOf("inviter_alias");
        String s281 = String.valueOf("conversations");
        String s282 = String.valueOf("inviter_chat_id");
        String s283 = String.valueOf("inviter_alias");
        String s284 = String.valueOf("chat_id");
        String s285 = String.valueOf("time_alias");
        v = (new StringBuilder(String.valueOf(obj).length() + 549 + String.valueOf(obj1).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(s21).length() + String.valueOf(s22).length() + String.valueOf(s23).length() + String.valueOf(s24).length() + String.valueOf(s25).length() + String.valueOf(s26).length() + String.valueOf(s27).length() + String.valueOf(s28).length() + String.valueOf(s29).length() + String.valueOf(s30).length() + String.valueOf(s31).length() + String.valueOf(s32).length() + String.valueOf(s33).length() + String.valueOf(s34).length() + String.valueOf(s35).length() + String.valueOf(s36).length() + String.valueOf(s37).length() + String.valueOf(s38).length() + String.valueOf(s39).length() + String.valueOf(s40).length() + String.valueOf(s41).length() + String.valueOf(s42).length() + String.valueOf(s43).length() + String.valueOf(s44).length() + String.valueOf(s45).length() + String.valueOf(s46).length() + String.valueOf(s47).length() + String.valueOf(s48).length() + String.valueOf(s49).length() + String.valueOf(s50).length() + String.valueOf(s51).length() + String.valueOf(s52).length() + String.valueOf(s53).length() + String.valueOf(s54).length() + String.valueOf(s55).length() + String.valueOf(s56).length() + String.valueOf(s57).length() + String.valueOf(s58).length() + String.valueOf(s59).length() + String.valueOf(s60).length() + String.valueOf(s61).length() + String.valueOf(s62).length() + String.valueOf(s63).length() + String.valueOf(s64).length() + String.valueOf(s65).length() + String.valueOf(s66).length() + String.valueOf(s67).length() + String.valueOf(s68).length() + String.valueOf(s69).length() + String.valueOf(s70).length() + String.valueOf(s71).length() + String.valueOf(s72).length() + String.valueOf(s73).length() + String.valueOf(s74).length() + String.valueOf(s75).length() + String.valueOf(s76).length() + String.valueOf(s77).length() + String.valueOf(s78).length() + String.valueOf(s79).length() + String.valueOf(s80).length() + String.valueOf(s81).length() + String.valueOf(s82).length() + String.valueOf(s83).length() + String.valueOf(s84).length() + String.valueOf(s85).length() + String.valueOf(s86).length() + String.valueOf(s87).length() + String.valueOf(s88).length() + String.valueOf(s89).length() + String.valueOf(s90).length() + String.valueOf(s91).length() + String.valueOf(s92).length() + String.valueOf(s93).length() + String.valueOf(s94).length() + String.valueOf(s95).length() + String.valueOf(s96).length() + String.valueOf(s97).length() + String.valueOf(s98).length() + String.valueOf(s99).length() + String.valueOf(s100).length() + String.valueOf(s101).length() + String.valueOf(s102).length() + String.valueOf(s103).length() + String.valueOf(s104).length() + String.valueOf(s105).length() + String.valueOf(s106).length() + String.valueOf(s107).length() + String.valueOf(s108).length() + String.valueOf(s109).length() + String.valueOf(s110).length() + String.valueOf(s111).length() + String.valueOf(s112).length() + String.valueOf(s113).length() + String.valueOf(s114).length() + String.valueOf(s115).length() + String.valueOf(s116).length() + String.valueOf(s117).length() + String.valueOf(s118).length() + String.valueOf(s119).length() + String.valueOf(s120).length() + String.valueOf(s121).length() + String.valueOf(s122).length() + String.valueOf(s123).length() + String.valueOf(s124).length() + String.valueOf(s125).length() + String.valueOf(s126).length() + String.valueOf(s127).length() + String.valueOf(s128).length() + String.valueOf(s129).length() + String.valueOf(s130).length() + String.valueOf(s131).length() + String.valueOf(s132).length() + String.valueOf(s133).length() + String.valueOf(s134).length() + String.valueOf(s135).length() + String.valueOf(s136).length() + String.valueOf(s137).length() + String.valueOf(s138).length() + String.valueOf(s139).length() + String.valueOf(s140).length() + String.valueOf(s141).length() + String.valueOf(s142).length() + String.valueOf(s143).length() + String.valueOf(s144).length() + String.valueOf(s145).length() + String.valueOf(s146).length() + String.valueOf(s147).length() + String.valueOf(s148).length() + String.valueOf(s149).length() + String.valueOf(s150).length() + String.valueOf(s151).length() + String.valueOf(s152).length() + String.valueOf(s153).length() + String.valueOf(s154).length() + String.valueOf(s155).length() + String.valueOf(s156).length() + String.valueOf(s157).length() + String.valueOf(s158).length() + String.valueOf(s159).length() + String.valueOf(s160).length() + String.valueOf(s161).length() + String.valueOf(s162).length() + String.valueOf(s163).length() + String.valueOf(s164).length() + String.valueOf(s165).length() + String.valueOf(s166).length() + String.valueOf(s167).length() + String.valueOf(s168).length() + String.valueOf(s169).length() + String.valueOf(s170).length() + String.valueOf(s171).length() + String.valueOf(s172).length() + String.valueOf(s173).length() + String.valueOf(s174).length() + String.valueOf(s175).length() + String.valueOf(s176).length() + String.valueOf(s177).length() + String.valueOf(s178).length() + String.valueOf(s179).length() + String.valueOf(s180).length() + String.valueOf(s181).length() + String.valueOf(s182).length() + String.valueOf(s183).length() + String.valueOf(s184).length() + String.valueOf(s185).length() + String.valueOf(s186).length() + String.valueOf(s187).length() + String.valueOf(s188).length() + String.valueOf(s189).length() + String.valueOf(s190).length() + String.valueOf(s191).length() + String.valueOf(s192).length() + String.valueOf(s193).length() + String.valueOf(s194).length() + String.valueOf(s195).length() + String.valueOf(s196).length() + String.valueOf(s197).length() + String.valueOf(s198).length() + String.valueOf(s199).length() + String.valueOf(s200).length() + String.valueOf(s201).length() + String.valueOf(s202).length() + String.valueOf(s203).length() + String.valueOf(s204).length() + String.valueOf(s205).length() + String.valueOf(s206).length() + String.valueOf(s207).length() + String.valueOf(s208).length() + String.valueOf(s209).length() + String.valueOf(s210).length() + String.valueOf(s211).length() + String.valueOf(s212).length() + String.valueOf(s213).length() + String.valueOf(s214).length() + String.valueOf(s215).length() + String.valueOf(s216).length() + String.valueOf(s217).length() + String.valueOf(s218).length() + String.valueOf(s219).length() + String.valueOf(s220).length() + String.valueOf(s221).length() + String.valueOf(s222).length() + String.valueOf(s223).length() + String.valueOf(s224).length() + String.valueOf(s225).length() + String.valueOf(s226).length() + String.valueOf(s227).length() + String.valueOf(s228).length() + String.valueOf(s229).length() + String.valueOf(s230).length() + String.valueOf(s231).length() + String.valueOf(s232).length() + String.valueOf(s233).length() + String.valueOf(s234).length() + String.valueOf(s235).length() + String.valueOf(s236).length() + String.valueOf(s237).length() + String.valueOf(s238).length() + String.valueOf(s239).length() + String.valueOf(s240).length() + String.valueOf(s241).length() + String.valueOf(s242).length() + String.valueOf(s243).length() + String.valueOf(s244).length() + String.valueOf(s245).length() + String.valueOf(s246).length() + String.valueOf(s247).length() + String.valueOf(s248).length() + String.valueOf(s249).length() + String.valueOf(s250).length() + String.valueOf(s251).length() + String.valueOf(s252).length() + String.valueOf(s253).length() + String.valueOf(s254).length() + String.valueOf(s255).length() + String.valueOf(s256).length() + String.valueOf(s257).length() + String.valueOf(s258).length() + String.valueOf(s259).length() + String.valueOf(s260).length() + String.valueOf(s261).length() + String.valueOf(s262).length() + String.valueOf(s263).length() + String.valueOf(s264).length() + String.valueOf(s265).length() + String.valueOf(s266).length() + String.valueOf(s267).length() + String.valueOf(s268).length() + String.valueOf(s269).length() + String.valueOf(s270).length() + String.valueOf(s271).length() + String.valueOf(s272).length() + String.valueOf(s273).length() + String.valueOf(s274).length() + String.valueOf(s275).length() + String.valueOf(s276).length() + String.valueOf(s277).length() + String.valueOf(s278).length() + String.valueOf(s279).length() + String.valueOf(s280).length() + String.valueOf(s281).length() + String.valueOf(s282).length() + String.valueOf(s283).length() + String.valueOf(s284).length() + String.valueOf(s285).length())).append(((String) (obj))).append(((String) (obj1))).append(s1).append(s2).append(", ").append(s3).append(".").append(s4).append(s5).append(s6).append(", ").append(s7).append(s8).append(s9).append(", ").append(s10).append(".").append(s11).append(s12).append(s13).append(", ").append(s14).append(".").append(s15).append(s16).append(s17).append(", ").append(s18).append(".").append(s19).append(s20).append(s21).append(", ").append(s22).append(s23).append(s24).append(", ").append(s25).append(".").append(s26).append(s27).append(s28).append(", ").append(s29).append(s30).append(s31).append(", ").append(s32).append(".").append(s33).append(s34).append(s35).append(", ").append(s36).append(".").append(s37).append(s38).append(s39).append(", ").append(s40).append(".").append(s41).append(s42).append(s43).append(", (select merge_key from ").append(s44).append(" where ").append(s45).append(".").append(s46).append("=").append(s47).append(".").append(s48).append(") ").append(s49).append(s50).append(", ").append(s51).append(s52).append(s53).append(", ").append(s54).append(s55).append(s56).append(", ").append(s57).append(s58).append(s59).append(", ").append(s60).append(s61).append(s62).append(", ").append(s63).append(s64).append(s65).append(", ").append(s66).append(s67).append(s68).append(", ").append(s69).append(s70).append(s71).append(", ").append(s72).append(s73).append(s74).append(", ").append(s75).append(s76).append(s77).append(", ").append(s78).append(s79).append(s80).append(", ").append(s81).append(s82).append(s83).append(", ").append(s84).append(s85).append(s86).append(", ").append(s87).append(s88).append(s89).append(", ").append(s90).append(s91).append(s92).append(", ").append(s93).append(s94).append(s95).append(", ").append(s96).append(s97).append(s98).append(", ").append(s99).append(".").append(s100).append(s101).append(s102).append(", ").append(s103).append(".").append(s104).append(s105).append(s106).append(", ").append(s107).append(".").append(s108).append(s109).append(s110).append(", ").append(s111).append(".").append(s112).append(s113).append(s114).append(", ").append(s115).append(".").append(s116).append(s117).append(s118).append(", ").append(s119).append(".").append(s120).append(s121).append(s122).append(", ").append(s123).append(".").append(s124).append(s125).append(s126).append(", ").append(s127).append(s128).append(s129).append(", ").append(s130).append(".").append(s131).append(s132).append(s133).append(", ").append(s134).append(".").append(s135).append(s136).append(s137).append(", ").append(s138).append(".").append(s139).append(s140).append(s141).append(", ").append(s142).append(".").append(s143).append(s144).append(s145).append(", ").append(s146).append(".").append(s147).append(s148).append(s149).append(", ").append(s150).append(".").append(s151).append(s152).append(s153).append(", ").append(s154).append(s155).append(s156).append(", ").append(s157).append(".").append(s158).append(s159).append(s160).append(", ").append(s161).append(".").append(s162).append(s163).append(s164).append(", ").append(s165).append(".").append(s166).append(s167).append(s168).append(", ").append(s169).append(".").append(s170).append(s171).append(s172).append(", ").append(s173).append(".").append(s174).append(s175).append(s176).append(", ").append(s177).append(".").append(s178).append(s179).append(s180).append(", ").append(s181).append(".").append(s182).append(s183).append(s184).append(", ").append(s185).append(".").append(s186).append(s187).append(s188).append(", ").append(s189).append(".").append(s190).append(s191).append(s192).append(", ").append(s193).append(".").append(s194).append(s195).append(s196).append(", ").append(s197).append(".").append(s198).append(s199).append(s200).append(", ").append(s201).append(".").append(s202).append(s203).append(s204).append(", ").append(s205).append(".").append(s206).append(s207).append(s208).append(", ").append(s209).append(".").append(s210).append(s211).append(s212).append(", ").append(s213).append(".").append(s214).append(s215).append(s216).append(",").append(s217).append(".").append(s218).append(s219).append(s220).append(",(SELECT count() FROM messages WHERE messages.conversation_id=conversations.conversation_id AND (").append(s221).append(".").append(s222).append("=1 OR ").append(s223).append(".").append(s224).append("=3) ) ").append(s225).append(s226).append(", max(%s) ").append(s227).append(s228).append(",  %s ").append(s229).append(s230).append(", IFNULL(").append(s231).append(".").append(s232).append(", ").append(s233).append(".").append(s234).append(") ").append(s235).append(s236).append(", IFNULL(").append(s237).append(".").append(s238).append(", ").append(s239).append(".").append(s240).append(") ").append(s241).append(s242).append(", ").append(s243).append(".").append(s244).append(s245).append(s246).append(", ").append(s247).append(".").append(s248).append(s249).append(s250).append(", ").append(s251).append(s252).append(s253).append(", ").append(s254).append(s255).append(s256).append(", ").append(s257).append(s258).append(s259).append(", ").append(s260).append(s261).append(s262).append(", ").append(s263).append(s264).append(s265).append(",  %s AS ").append(s266).append(",  %s AS ").append(s267).append(",  %s AS ").append(s268).append(" FROM %s %s  LEFT JOIN ").append(s269).append(" ").append(s270).append(" ON (").append(s271).append(".").append(s272).append("=").append(s273).append(".").append(s274).append(" OR ").append(s275).append(".").append(s276).append("=").append(s277).append(".").append(s278).append(")  LEFT JOIN ").append(s279).append(" ").append(s280).append(" ON (").append(s281).append(".").append(s282).append("=").append(s283).append(".").append(s284).append(") , (SELECT (julianday('now') - 2440587.5) * 86400000000 AS CURRENT_TIMESTAMP) ").append(s285).toString();
        w = String.format(Locale.US, "group_concat(IFNULL(%s, %s), %s)", new Object[] {
            "inviter_alias.full_name", "inviter_alias.fallback_name", "\"|\""
        });
        x = String.format(Locale.US, "group_concat(%s, %s)", new Object[] {
            "conversations.sort_timestamp", "\"|\""
        });
        obj = String.valueOf("CREATE VIEW conversations_view AS ");
        obj1 = Locale.US;
        s1 = v;
        s2 = String.valueOf("9223372036854775807");
        obj1 = String.valueOf(String.format(((Locale) (obj1)), s1, new Object[] {
            (new StringBuilder(String.valueOf(s2).length() + 2)).append("\"").append(s2).append("\"").toString(), "0", "sum(1)", w, x, "(select conversations.* from conversations order by sort_timestamp asc) as conversations ", ""
        }));
        s1 = String.valueOf("conversations");
        s2 = String.valueOf("status");
        s3 = String.valueOf("inviter_affinity");
        s4 = String.valueOf("conversations");
        s5 = String.valueOf("status");
        s6 = String.valueOf(String.format(Locale.US, v, new Object[] {
            "conversations.sort_timestamp", "CASE WHEN conversations.conversation_type == 1 AND blocked_alias.conversation_id ==conversations.conversation_id THEN 1 ELSE 0 END", "1", "\"\"", "\"\"", "conversations", " LEFT JOIN (SELECT DISTINCT conversation_participants.conversation_id AS conversation_id FROM conversation_participants LEFT JOIN participants ON (participants._id=participant_row_id) WHERE participants.blocked==1) AS blocked_alias ON conversations.conversation_id=blocked_alias.conversation_id"
        }));
        s7 = String.valueOf("conversations");
        s8 = String.valueOf("status");
        s9 = String.valueOf("merge_key");
        c = (new StringBuilder(String.valueOf(obj).length() + 85 + String.valueOf(obj1).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length())).append(((String) (obj))).append(((String) (obj1))).append(" WHERE ").append(s1).append(".").append(s2).append("=1 AND ").append(s3).append("=1 GROUP BY ").append(s4).append(".").append(s5).append(" UNION ").append(s6).append(" WHERE ").append(s7).append(".").append(s8).append("=2 GROUP BY ").append(s9).toString();
        obj = String.valueOf("CREATE VIEW invites_view AS ");
        obj1 = String.valueOf(String.format(Locale.US, v, new Object[] {
            "conversations.sort_timestamp", "0", "1", "\"\"", "\"\"", "conversations", ""
        }));
        s1 = String.valueOf("conversations");
        s2 = String.valueOf("status");
        s3 = String.valueOf("conversations");
        s4 = String.valueOf("view");
        s5 = String.valueOf("conversations");
        s6 = String.valueOf("conversation_id");
        d = (new StringBuilder(String.valueOf(obj).length() + 49 + String.valueOf(obj1).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append(((String) (obj))).append(((String) (obj1))).append(" WHERE ").append(s1).append(".").append(s2).append("=1 AND ").append(s3).append(".").append(s4).append("=1 GROUP BY ").append(s5).append(".").append(s6).toString();
        obj = String.valueOf("CREATE TRIGGER MESSAGE_ERROR_TRIGGER  AFTER UPDATE OF status ON messages WHEN  NEW.status!=OLD.status BEGIN  UPDATE messages SET alert_status = ( CASE  WHEN NEW.status=");
        i1 = dqb.d.ordinal();
        obj1 = String.valueOf("status");
        int j1 = dqb.e.ordinal();
        s1 = String.valueOf("messages");
        s2 = String.valueOf("message_id");
        s3 = String.valueOf("message_id");
        y = (new StringBuilder(String.valueOf(obj).length() + 108 + String.valueOf(obj1).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(((String) (obj))).append(i1).append(" THEN 3 WHEN NEW.").append(((String) (obj1))).append("=").append(j1).append(" THEN 0 ELSE 0").append(" END) WHERE ").append(s1).append(".").append(s2).append("=NEW.").append(s3).append("; END ").toString();
        obj = String.valueOf("CREATE TRIGGER CONVERSATION_MERGE_KEY_TRIGGER  AFTER INSERT ON conversations FOR EACH ROW  BEGIN  INSERT INTO merge_keys ( conversation_id, merge_key)  VALUES (NEW.conversation_id, \"");
        obj1 = aqc.e.f;
        s1 = String.valueOf("conversation_id");
        e = (new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(obj1).length() + String.valueOf(s1).length())).append(((String) (obj))).append(((String) (obj1))).append("\"||NEW.").append(s1).append("); END; ").toString();
        obj = String.valueOf(u);
        obj1 = String.valueOf("conversations");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        f = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("conversation");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        g = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("invites_view");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        h = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("suggested_contacts");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        i = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("message_notifications_view");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        j = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("blocked_people");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        k = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("dismissed_contacts");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        l = Uri.parse(((String) (obj)));
        obj = u;
        obj1 = String.valueOf("event_suggestions");
        m = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 13 + String.valueOf(obj1).length())).append(((String) (obj))).append(((String) (obj1))).append("/conversation").toString());
        obj = String.valueOf(u);
        obj1 = String.valueOf("recent_calls");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        n = Uri.parse(((String) (obj)));
        obj = u;
        obj1 = String.valueOf("messages");
        o = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 13 + String.valueOf(obj1).length())).append(((String) (obj))).append(((String) (obj1))).append("/conversation").toString());
        obj = u;
        obj1 = String.valueOf("messages");
        p = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 14 + String.valueOf(obj1).length())).append(((String) (obj))).append(((String) (obj1))).append("/conversations").toString());
        obj = u;
        obj1 = String.valueOf("conversation_images_view");
        z = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 13 + String.valueOf(obj1).length())).append(((String) (obj))).append(((String) (obj1))).append("/conversation").toString());
        obj = String.valueOf(u);
        obj1 = String.valueOf("imagescratchspace");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        A = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("conversation_participants");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        B = Uri.parse(((String) (obj)));
        obj = String.valueOf(u);
        obj1 = String.valueOf("sms_phone_numbers");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        q = Uri.parse(((String) (obj)));
        obj = String.valueOf(i);
        r = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 6)).append(((String) (obj))).append("/query").toString());
        obj = String.valueOf(u);
        obj1 = String.valueOf("presence");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        s = Uri.parse(((String) (obj)));
        obj = new UriMatcher(-1);
        C = ((UriMatcher) (obj));
        ((UriMatcher) (obj)).addURI(a, "conversations", 100);
        C.addURI(a, "conversation", 102);
        C.addURI(a, "invites_view", 101);
        C.addURI(a, "conversation_participants/conversation/*", 110);
        C.addURI(a, "sms_phone_numbers", 220);
        C.addURI(a, "blocked_people", 190);
        C.addURI(a, "dismissed_contacts", 230);
        C.addURI(a, "message_notifications_view", 160);
        C.addURI(a, "messages/conversation/*", 120);
        C.addURI(a, "messages/conversations/*", 121);
        C.addURI(a, "imagescratchspace/*", 140);
        C.addURI(a, "conversation_images_view/conversation/*", 130);
        C.addURI(a, "suggested_contacts", 180);
        C.addURI(a, "suggested_contacts/query/*", 181);
        C.addURI(a, "suggested_contacts/query", 181);
        C.addURI(a, "event_suggestions/conversation/*", 200);
        C.addURI(a, "recent_calls", 210);
        C.addURI(a, "presence", 240);
        obj = new gz();
        D = ((Map) (obj));
        ((Map) (obj)).put("_id", "_id");
        D.put("gaia_id", "gaia_id");
        D.put("chat_id", "chat_id");
        D.put("name", "name");
        D.put("profile_photo_url", "profile_photo_url");
        obj = new gz();
        E = ((Map) (obj));
        ((Map) (obj)).put("_id", "_id");
        E.put("gaia_id", "gaia_id");
        E.put("chat_id", "chat_id");
        E.put("name", "name");
        E.put("profile_photo_url", "profile_photo_url");
        obj = new gz();
        F = ((Map) (obj));
        ((Map) (obj)).put("chat_id", "conversation_participants_view.chat_id");
        F.put("latest_message_timestamp", "conversations.latest_message_timestamp");
        obj = new gz();
        G = ((Map) (obj));
        ((Map) (obj)).put("_id", "recent_calls._id");
        G.put("contact_id", "contact_id");
        G.put("phone_number", "phone_number");
        G.put("call_timestamp", "call_timestamp");
        G.put("call_type", "call_type");
        G.put("contact_type", "contact_type");
        G.put("call_rate", "call_rate");
        G.put("is_free_call", "is_free_call");
        H = new StringBuilder();
        return;
        obj;
        obj = "com.google.android.apps.hangouts.content.EsProviderAltBuild";
          goto _L1
    }
}
