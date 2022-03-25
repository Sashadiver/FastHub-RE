// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package com.fastaccess.data.dao.model;

import javax.annotation.Generated;

import io.requery.Persistable;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.NumericAttribute;
import io.requery.meta.QueryAttribute;
import io.requery.meta.StringAttribute;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.IntProperty;
import io.requery.proxy.LongProperty;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;

@Generated("io.requery.processor.EntityProcessor")
public class PinnedPullRequests extends AbstractPinnedPullRequests implements Persistable {
    public static final NumericAttribute<PinnedPullRequests, Integer> ENTRY_COUNT = 
    new AttributeBuilder<PinnedPullRequests, Integer>("entryCount", int.class)
    .setProperty(new IntProperty<PinnedPullRequests>() {
        @Override
        public Integer get(PinnedPullRequests entity) {
            return entity.entryCount;
        }

        @Override
        public void set(PinnedPullRequests entity, Integer value) {
            if(value != null) {
                entity.entryCount = value;
            }
        }

        @Override
        public int getInt(PinnedPullRequests entity) {
            return entity.entryCount;
        }

        @Override
        public void setInt(PinnedPullRequests entity, int value) {
            entity.entryCount = value;
        }
    })
    .setPropertyName("entryCount")
    .setPropertyState(new Property<PinnedPullRequests, PropertyState>() {
        @Override
        public PropertyState get(PinnedPullRequests entity) {
            return entity.$entryCount_state;
        }

        @Override
        public void set(PinnedPullRequests entity, PropertyState value) {
            entity.$entryCount_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildNumeric();

    public static final StringAttribute<PinnedPullRequests, String> LOGIN = 
    new AttributeBuilder<PinnedPullRequests, String>("login", String.class)
    .setProperty(new Property<PinnedPullRequests, String>() {
        @Override
        public String get(PinnedPullRequests entity) {
            return entity.login;
        }

        @Override
        public void set(PinnedPullRequests entity, String value) {
            entity.login = value;
        }
    })
    .setPropertyName("login")
    .setPropertyState(new Property<PinnedPullRequests, PropertyState>() {
        @Override
        public PropertyState get(PinnedPullRequests entity) {
            return entity.$login_state;
        }

        @Override
        public void set(PinnedPullRequests entity, PropertyState value) {
            entity.$login_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildString();

    public static final QueryAttribute<PinnedPullRequests, PullRequest> PULL_REQUEST = 
    new AttributeBuilder<PinnedPullRequests, PullRequest>("pullRequest", PullRequest.class)
    .setProperty(new Property<PinnedPullRequests, PullRequest>() {
        @Override
        public PullRequest get(PinnedPullRequests entity) {
            return entity.pullRequest;
        }

        @Override
        public void set(PinnedPullRequests entity, PullRequest value) {
            entity.pullRequest = value;
        }
    })
    .setPropertyName("pullRequest")
    .setPropertyState(new Property<PinnedPullRequests, PropertyState>() {
        @Override
        public PropertyState get(PinnedPullRequests entity) {
            return entity.$pullRequest_state;
        }

        @Override
        public void set(PinnedPullRequests entity, PropertyState value) {
            entity.$pullRequest_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setConverter(new com.fastaccess.data.dao.converters.PullRequestConverter())
    .build();

    public static final NumericAttribute<PinnedPullRequests, Long> PULL_REQUEST_ID = 
    new AttributeBuilder<PinnedPullRequests, Long>("pullRequestId", long.class)
    .setProperty(new LongProperty<PinnedPullRequests>() {
        @Override
        public Long get(PinnedPullRequests entity) {
            return entity.pullRequestId;
        }

        @Override
        public void set(PinnedPullRequests entity, Long value) {
            if(value != null) {
                entity.pullRequestId = value;
            }
        }

        @Override
        public long getLong(PinnedPullRequests entity) {
            return entity.pullRequestId;
        }

        @Override
        public void setLong(PinnedPullRequests entity, long value) {
            entity.pullRequestId = value;
        }
    })
    .setPropertyName("pullRequestId")
    .setPropertyState(new Property<PinnedPullRequests, PropertyState>() {
        @Override
        public PropertyState get(PinnedPullRequests entity) {
            return entity.$pullRequestId_state;
        }

        @Override
        public void set(PinnedPullRequests entity, PropertyState value) {
            entity.$pullRequestId_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildNumeric();

    public static final NumericAttribute<PinnedPullRequests, Long> ID = 
    new AttributeBuilder<PinnedPullRequests, Long>("id", long.class)
    .setProperty(new LongProperty<PinnedPullRequests>() {
        @Override
        public Long get(PinnedPullRequests entity) {
            return entity.id;
        }

        @Override
        public void set(PinnedPullRequests entity, Long value) {
            entity.id = value;
        }

        @Override
        public long getLong(PinnedPullRequests entity) {
            return entity.id;
        }

        @Override
        public void setLong(PinnedPullRequests entity, long value) {
            entity.id = value;
        }
    })
    .setPropertyName("id")
    .setPropertyState(new Property<PinnedPullRequests, PropertyState>() {
        @Override
        public PropertyState get(PinnedPullRequests entity) {
            return entity.$id_state;
        }

        @Override
        public void set(PinnedPullRequests entity, PropertyState value) {
            entity.$id_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setReadOnly(true)
    .setLazy(false)
    .setNullable(false)
    .setUnique(false)
    .buildNumeric();

    public static final Type<PinnedPullRequests> $TYPE = new TypeBuilder<PinnedPullRequests>(PinnedPullRequests.class, "PinnedPullRequests")
    .setBaseType(AbstractPinnedPullRequests.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setView(false)
    .setFactory(new Supplier<PinnedPullRequests>() {
        @Override
        public PinnedPullRequests get() {
            return new PinnedPullRequests();
        }
    })
    .setProxyProvider(new Function<PinnedPullRequests, EntityProxy<PinnedPullRequests>>() {
        @Override
        public EntityProxy<PinnedPullRequests> apply(PinnedPullRequests entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(PULL_REQUEST_ID)
    .addAttribute(ENTRY_COUNT)
    .addAttribute(LOGIN)
    .addAttribute(ID)
    .addAttribute(PULL_REQUEST)
    .build();

    private PropertyState $entryCount_state;

    private PropertyState $login_state;

    private PropertyState $pullRequest_state;

    private PropertyState $pullRequestId_state;

    private PropertyState $id_state;

    private final transient EntityProxy<PinnedPullRequests> $proxy = new EntityProxy<PinnedPullRequests>(this, $TYPE);

    public PinnedPullRequests() {
    }

    public int getEntryCount() {
        return $proxy.get(ENTRY_COUNT);
    }

    public void setEntryCount(int entryCount) {
        $proxy.set(ENTRY_COUNT, entryCount);
    }

    public String getLogin() {
        return $proxy.get(LOGIN);
    }

    public void setLogin(String login) {
        $proxy.set(LOGIN, login);
    }

    public PullRequest getPullRequest() {
        return $proxy.get(PULL_REQUEST);
    }

    public void setPullRequest(PullRequest pullRequest) {
        $proxy.set(PULL_REQUEST, pullRequest);
    }

    public long getPullRequestId() {
        return $proxy.get(PULL_REQUEST_ID);
    }

    public void setPullRequestId(long pullRequestId) {
        $proxy.set(PULL_REQUEST_ID, pullRequestId);
    }

    public long getId() {
        return $proxy.get(ID);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof PinnedPullRequests && ((PinnedPullRequests)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }

    @Override
    public String toString() {
        return $proxy.toString();
    }
}
