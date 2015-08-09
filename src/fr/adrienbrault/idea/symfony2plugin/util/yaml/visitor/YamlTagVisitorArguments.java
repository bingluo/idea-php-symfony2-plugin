package fr.adrienbrault.idea.symfony2plugin.util.yaml.visitor;

import fr.adrienbrault.idea.symfony2plugin.util.yaml.YamlHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.yaml.psi.YAMLHash;

/**
 * Abstract visitor, so we can support as YAMLHash in future
 * Don't to directly use YAMLHash here
 *
 * @author Daniel Espendiller <daniel@espendiller.net>
 */
public class YamlTagVisitorArguments {

    private final String tagName;
    private final YAMLHash yamlHash;

    public YamlTagVisitorArguments(@NotNull String tagName, @NotNull YAMLHash yamlHash) {
        this.tagName = tagName;
        this.yamlHash = yamlHash;
    }

    public String getName() {
        return tagName;
    }

    /**
     * Our abstract method to get tag attributes
     *
     * @param attr yaml hash attribute to get value of
     * @return value
     */
    @Nullable
    public String getAttribute(@NotNull String attr) {
        return YamlHelper.getYamlKeyValueAsString(yamlHash, attr);
    }

}
